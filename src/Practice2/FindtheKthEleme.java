package Practice2;

public class FindtheKthEleme {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(5, new ListNode(4,
                new ListNode(3, new ListNode(2, new ListNode(1, null)))));

        System.out.println(findElementLinkedList(listNode,3).val);
    }

    static ListNode findElementLinkedList(ListNode node, int k){
        ListNode dummy = new ListNode(0);
        dummy.next = node;
        ListNode fastNode = dummy;
        ListNode slowNode = dummy;

        while(fastNode.next != null && fastNode.next.next !=null){
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }

        slowNode.next = slowNode.next.next;

        return slowNode;
    }
}
