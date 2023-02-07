package lesson09;

public class myLinkedListQueue implements iStackQueue{

    public class Node{
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }

    Node headNode, tailNode;
    @Override
    public boolean push(int value) {
        //thêm vào cuối linked list
       if (isFull()) return false;
       Node newNode = new Node(value);
       if (isEmpty()) headNode = tailNode = newNode;
       else{
           tailNode.next = newNode;
           tailNode = newNode;
       }
       return true;
    }

    @Override
    public int pop() {
        //remove head
        int value = -1;
        if (isEmpty()) return -1;
        value = headNode.value;
        if (headNode==tailNode) headNode=tailNode=null; // reset lại các biến khi queue có 1 phần tử;
        else headNode = headNode.next;
        return value;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return headNode==null && tailNode==null;
    }

    @Override
    public void show() {
        if (isEmpty()) System.out.println("Queue is Empty");
        else {
            Node curNode = headNode;
            while (curNode!=null) {
                System.out.println(curNode.value + ";");
                curNode = curNode.next;
            }
            System.out.println();
        }
    }
}
