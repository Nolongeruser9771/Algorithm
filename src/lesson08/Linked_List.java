package lesson08;

public class Linked_List {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.next = n2;
        n2.next = n3;

        print(n1);
        n1 = addToHead(n1,0);
        print(n1);
        n1 = addToTail(n1, 4);
        print(n1);
        n1 = addToIndex(n1,2,3);
        print(n1);
        n1 = removeAtHead(n1);
        print(n1);
        n1= removeAtTail(n1);
        print(n1);
        n1 = removeAtIndex(n1, 3);
        print(n1);
        n1 = removeAtIndex(n1, 0);
        print(n1);
    }
    public static void print(Node head) {
        if (head==null) {
            System.out.println("Empty list");
        } else {
            Node temp = head;
            while (temp!=null) {
                //Chừng nào mà temp còn khác null thì
                //Node trước còn trỏ vào node sau
                System.out.print(temp.value);
                temp = temp.next;
                if (temp!= null) {
                    System.out.print("->");
                } else System.out.println("\t");
            }
        }
    }
    public static class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }//tạo hàm tạo nhận giá trị value
    }

    //Thêm phần từ vào đầu Linked List  -> trả về node đầu của list mới
    public static Node addToHead(Node headNode, int value) {
        //Tạo ra 1 node mới
        Node newNode = new Node(value);
        //Nếu headNode khác null thì gán next của newNode vào head;
        if (headNode!=null) newNode.next = headNode;
        return newNode;
    }

    //Thêm phần tử vào cuối Linked List -> trả về node cuối của list mới
    public static Node addToTail(Node headNode, int value) {
        //Tạo newNode
        Node newNode = new Node(value);


        if (headNode!=null) {
            //Xác định vị trí node cuối (lastNode.next = null)
            Node lastNode = headNode;
            while (lastNode.next!=null) {
                lastNode = lastNode.next;
            }

            // trỏ next của lastNode vào newNode
            lastNode.next = newNode;
        }
        return headNode;
    }

    public static Node addToIndex(Node headNode, int value, int index) {
        if (index==0) return addToHead(headNode,value);
        else {
            //B1. Tìm vị trí cần thêm
            Node newNode = new Node(value);
            Node currentNode = headNode;
            int count = 0;
            while (currentNode!=null) { //Vẫn chưa phải Node cuối cùng
                count++;
                if (count==index) {
                    //B2. next của currentNode = newNode; newNode.next = currentNode.next
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
        return headNode;
    }


    /********************XOÁ PHẦN TỪ********************/
    public static Node removeAtHead(Node headNode) {
        if (headNode!=null) {
            return headNode.next; //trỏ vào phần tử kế tiếp
        }
        return headNode;
    }

    public static Node removeAtTail(Node headNode) {

        //Xác định last và prev
        Node lastNode = headNode;
        Node prevNode = null;
        if (headNode==null) return null;
        else {
            while (lastNode.next!=null) { // vẫn chưa phải node cuối
                prevNode = lastNode;
                lastNode = lastNode.next;
            }
        }
        //Trỏ next của prev vào null
        if (prevNode==null) return null;
        else prevNode.next = null; //hay bằng lastNode.next

        return headNode;
    }

    public static Node removeAtIndex(Node headNode, int index) {
        if (headNode==null||index<0) return null; //input không hợp lệ
        //Xác định pre, cur, nextNode
        if (index==0) return removeAtHead(headNode); // remove headNode
        Node currNode = headNode;
        Node prevNode = null;
        int count = 0;
        boolean isFound = false;
        while (currNode!=null) { //không phải node cuối cùng
            if (count==index) {
                isFound = true;
                break;
            }
            prevNode = currNode;
            currNode = currNode.next;
            count++;
        }
        if (isFound) {
            //Tiến hành xoá, next của prev = next của current
            prevNode.next = currNode.next;
        }
        return headNode;
    }
}

