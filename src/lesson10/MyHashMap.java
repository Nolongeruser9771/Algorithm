package lesson10;

import java.util.ArrayList;

public class MyHashMap { //leetcoe_706
    //chuyển key sang giá trị HashValue ---> tương ứng với bucket (key-value);
    //Với bài toán tìm key và số lần xuất hiện, value = freq(key);

    public class keyValue {
        //Tạo class chứa 2 thuộc tính key - value;
        int key;
        int value;
        //Hàm tạo
        keyValue(int key, int value) {
            this.key = key;
            this.value = value;
        }
        @Override
        //Viết lại hàm equals, keyValue equals khi key equals (chỉ xét key, ko xét value);
        public boolean equals (Object obj) {
            //Kiểm tra xem 1 Obj có thuộc kiểu keyValue ko, nếu ko return false;
            if (obj instanceof keyValue)
                return this.key == ((keyValue)obj).key; //return true khi key giống nhau
            return false;
        }
    }

    private final ArrayList<keyValue>[] myBuckets; //Tạo 1 mảng các ArrayList chứa cặp key-value
    public MyHashMap() {
        //Hàm tạo
        myBuckets = new ArrayList[10000];
        //duyệt từng phần tử của mảng
        for (int i = 0; i < myBuckets.length; i++) {
            myBuckets[i] = new ArrayList<>();
        }
    }

    public ArrayList<keyValue> bucket(int key) {
        //Băm mảng
        int hashValue = hashFunction(key); //hashValue cũng là index của myBuckets
        //Tham chiếu tới bucket trong list myBuckets
        return myBuckets[hashValue];
    }

    public int keyIndex(int key) {
        //Tạo 1 biến tạm kiểu keyValue có key bằng key cần kiểm tra
        keyValue data = new keyValue(key, 0);
        //Kiểm tra index của biến tạm trong bucket
        return bucket(key).indexOf(data);
    }
    public boolean contains(int key) {
        //kiểm tra xem key - value có tồn tại hay không
        return keyIndex(key)>=0;
    }
    public int hashFunction(int key) {
        //Chuyển đổi key thành HashValue
        return key%10000;
    }

    public void put(int key, int value) {
        ArrayList<keyValue> bucket = bucket(key);
        if (contains(key)) bucket.get(keyIndex(key)).value = value; //Nếu có tồn tại key thì update value mới cho key đó
        else bucket.add(new keyValue(key,value)); //Nếu chưa tồn tại key thì add 1 cặp key - value mới
    }

    public int get(int key) {
        ArrayList<keyValue> bucket = bucket(key);
        int keyIndex = keyIndex(key);

        if (contains(key)) return bucket.get(keyIndex).value;
        return -1;
    }

    public void remove(int key) {
        ArrayList<keyValue> bucket = bucket(key);
        keyValue removeData = new keyValue(key,0);
        //hàm equals override đối chiếu key với biến tạm removeData, và remove phần tử có key bằng key biến tạm
        bucket.remove(removeData);
    }

    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
//        myHashMap.put(1,2);
//        myHashMap.put(1,4);
//        myHashMap.put(2,4);
//
//        myHashMap.remove(1);
        System.out.println(myHashMap.get(2));
    }
}
