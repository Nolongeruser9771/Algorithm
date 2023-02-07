package lesson09;

public interface iStackQueue {
    public boolean push (int value); //thêm vào thì có thể bộ nhớ sẽ đầy nên phải trả về boolean kiểm tra
    public int pop();// trả về phần tử cuối cùng đối với queue, và phần tử đầu đổi với stack

    public boolean isFull();
    public boolean isEmpty();

    public void show();
}
