package Practice2;

public class ContructTreeUsingLinked {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(5, new ListNode(4,
                new ListNode(3, new ListNode(2, new ListNode(1, null)))));
        System.out.println(constructTreeUsingLL(listNode, null).right.val);

    }

    static TreeNode constructTreeUsingLL(ListNode head, ListNode tail) {

        if (tail == head || head == null) return null;

        ListNode midNode = findTheRootElement(head, tail);
        TreeNode root = null;
        root = new TreeNode(midNode.val);
        root.left = constructTreeUsingLL(head, midNode);
        root.right = constructTreeUsingLL(midNode.next, tail);

        return root;
}
    static ListNode findTheRootElement(ListNode head, ListNode tail) {
        ListNode fastNode = head, slowNode = head;

        while (fastNode.next != tail && fastNode.next.next != tail) {
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }
        return slowNode;
    }
}
