package lesson08;

public class ReverseLinkedList_206 {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        reverseList(n1);
        print(n5);
    }

    public static ListNode reverseList(ListNode headNode) {
        //Có cur, head, next -> remove next, thêm next vào trước head
        //cur.next = next.next  (bỏ next ra)
        //next.next = head (next vừa bỏ ra trỏ tới đầu list, trỏ tới head)
        //head = next (gán lại head bằng next mới remove)
        //CT dừng khi next của cur = null -> trỏ vào node cuối cùng

        ListNode currNode = headNode;

        while (currNode!=null && currNode.next!=null) {
            ListNode nextNode = currNode.next; //Tạo 1 node lưu giá trị currNode
            currNode.next = nextNode.next; //bỏ đi giá trị nextNode
            nextNode.next = headNode; // nextNode đứng phía đầu của headNode
            headNode = nextNode; //update lại giá trị head;
        }
        return headNode;
    }

    public static void print(ListNode headNode) {
        while (headNode!=null) {
            System.out.println(headNode.value);
            headNode = headNode.next;
        }
    }
}
