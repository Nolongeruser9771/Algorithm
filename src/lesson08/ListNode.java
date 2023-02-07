package lesson08;

public class ListNode {
    int value;
    ListNode next;

    ListNode() {}
    ListNode(int value) {this.value = value;}//tạo hàm tạo nhận giá trị value
    ListNode(int value, ListNode next) {this.value = value; this.next = next;}
}
