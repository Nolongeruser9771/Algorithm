package lesson08;

public class LinkedListCycle_141 {
    //Idea: 2 con trỏ, 1 con nhảy 1 bước, 1 con nhảy 2 bước.
    // Nếu 2 con trỏ gặp nhau thì chứng tỏ có cycle trong linked list;

    public boolean hasCycle(ListNode head) {
        ListNode firstPoint = head;
        ListNode secondPoint = head;

        while (secondPoint != null && secondPoint.next!=null) {
            firstPoint = firstPoint.next;
            secondPoint = secondPoint.next.next;

            if (firstPoint == secondPoint) return true;
        }
        return false;
    }
}
