package lesson09;

public class myArrayStack implements iStackQueue{
    private int[] array;
    private int SIZE;
    private int topIndex;


    myArrayStack(int size) {
        //hàm khởi tạo
        SIZE = size;
        array = new int[SIZE];
        topIndex = -1; //đang rỗng; khi push +1, pop -1;
    }
    @Override
    public boolean push(int value) {
        if (!isFull()) {
            topIndex++; //array không full thì tăng topIndex lên 1, và gán array[topIndex] bằng giá trị thêm vào
            array[topIndex]=value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if (!isEmpty()) {
            int value = array[topIndex];
            topIndex--;
            return value;
        }
        return -1;
    }

    @Override
    public boolean isFull() {
        return topIndex==SIZE-1; //topIndex trỏ vào phần tử cuối cùng
    }

    @Override
    public boolean isEmpty() {
        return topIndex<0; //phần tử đầu tiên topIndex = 0;
    }

    @Override
    public void show() {
        if (isEmpty()) {
            System.out.println("stack is empty");
        } else {
            for (int i = 0; i <= topIndex; i++) {
                System.out.println(array[i] + ";");
            }
            System.out.println();
        }
    }

}
