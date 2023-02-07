package lesson09;

import java.util.ArrayList;

public class myLinkedListStack implements iStackQueue{
    private class Node{
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }

    Node topNode; //=null
    myLinkedListStack() {

    }

    @Override
    public boolean push(int value) {
        if (!isFull()){
            //Thêm phần tử vào đầu linked list
            Node newNode = new Node(value);
            newNode.next = topNode;
            topNode = newNode;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        int value = -1;
        if (!isEmpty()) {
            value = topNode.value;
            topNode = topNode.next;
        }
        return value;
    }

    @Override
    public boolean isFull() {
        return false; //chỉ khi tràn bộ nhớ mới full thôi, để mặc định là false
    }

    @Override
    public boolean isEmpty() {
        return topNode==null;
    }

    @Override
    public void show() {
        if (isEmpty()){
            System.out.println("stack is empty");
        }
        Node tem = topNode;
//        while (tem!=null) {
//            System.out.println(tem.value + ";");
//            tem = tem.next;
//        }

        ArrayList<Integer> tempList = new ArrayList<>();
        while (tem!=null) {
            tempList.add(tem.value);
            tem = tem.next;
        }

        for (int i = tempList.size()-1; i >=0 ; i--) {
            System.out.println(tempList.get(i) + ";");
            System.out.println();
        }
    }
}
