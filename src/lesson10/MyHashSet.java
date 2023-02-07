package lesson10;

import java.util.ArrayList;

public class MyHashSet {
    //HashSet: quản lí 1 tập key (chỉ cần quản lí Key: kiểm tra phần tử tồn tại không)
    //HashMap: quản lí 1 cặp key - value (quản lí thông tin dựa trên khóa - key, đếm số lượng xuất hiện của phần tử)
    
    private final int SIZE = 10000000;
    private ArrayList<Integer> myBuckets[]; //tạo 1 mảng mà mỗi phần tử là 1 arrayList
    MyHashSet() {
        //Hàm tạo
        myBuckets = new ArrayList[SIZE]; // tạo bucket là 1 arrayList có SIZE phần tử;
        //tạo phần tử cho từng dòng 1 
        for (int i = 0; i < myBuckets.length; i++) {
            myBuckets[i] = new ArrayList<>();
        }
    }

    public int hashFunction(int key) {
        return key%SIZE; //Function để biến đổi thành hashValue - index của mảng ứng với các bucket ở dạng linkedlist||arrayList
    }

    public void add(int key) {
        //Băm mảng
        int hashValue = hashFunction(key); //hashValue (index của mảng băm) bằng hashFunction của key
        ArrayList<Integer> bucket = myBuckets[hashValue];

        //Kiểm tra giá trị đã tồn tại hay chưa
        int keyIndex = bucket.indexOf(key);
        if (keyIndex<0) bucket.add(key);
    }

    public void remove(int key) {
        //Băm mảng
        int hashValue = hashFunction(key); //hashValue (index của mảng băm) bằng hashFunction của key
        ArrayList<Integer> bucket = myBuckets[hashValue];

        //Kiểm tra có tồn tại index không -> remove
        int keyIndex = bucket.indexOf(key);
        if (keyIndex>=0) bucket.remove(keyIndex);
    }

    public boolean contains(int key) {
        //Băm mảng
        int hashValue = hashFunction(key); //hashValue (index của mảng băm) bằng hashFunction của key
        ArrayList<Integer> bucket = myBuckets[hashValue];

        //Kiểm tra có tồn tại index không
        int keyIndex = bucket.indexOf(key);
        return keyIndex>=0;
    }

    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);
        myHashSet.add(1);
        myHashSet.add(3);

        myHashSet.remove(3);
        System.out.println("Contain 1 " + myHashSet.contains(1));
        System.out.println("Contain 3 " + myHashSet.contains(3));
    }

}
