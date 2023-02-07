package lesson09;

public class myArrayQueue implements iStackQueue{
    private int[] array;
    private int SIZE;
    private int headIndex;
    private int tailIndex;

    myArrayQueue(int size){
        SIZE = size;
        array = new int[SIZE];
        headIndex = tailIndex = -1;// mảng rỗng
    }

    @Override
    public boolean push(int value) {
        if (!isFull()) {
            if (isEmpty()){
                headIndex++; //giả như mảng ban đầu rỗng -> khi thêm 1 phần tử, cả head và tail đều trỏ vào 1 phần tử
            }
            tailIndex++;
            array[tailIndex] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        //Chú ý trường hợp mảng chỉ có 1 phần tử
        int value = -1;
        if (!isEmpty()) {
            value = array[headIndex];
            headIndex++;
            if (headIndex>tailIndex) { // trở về mảng rỗng -> reset tất cả các biến
                headIndex = tailIndex = -1;
            }
        }
        return value;
    }

    public int count() {
        //tạo hàm count đếm số phần tử
        if (isEmpty()) return 0;
        else return tailIndex-headIndex+1;
    }

    @Override
    public boolean isFull() {
        return tailIndex == SIZE-1;
    }

    @Override
    public boolean isEmpty() {
        return (headIndex==-1)&&(tailIndex==-1);
    }

    @Override
    public void show() {
        if (isEmpty()) System.out.println("Queue is empty");
        else {
            for (int i = headIndex; i <= tailIndex ; i++) {
                System.out.println(array[i] + ";");
            }
            System.out.println();
        }
    }
}
