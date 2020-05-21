package Practice2;

public class ContructTreeUsingLL {

    public static void main(String[] args) {

        ListNode listNode = new ListNode(5, new ListNode(4,
                new ListNode(3, new ListNode(2, new ListNode(1, null)))));
        TreeNode treeNode = construcTreeFromLL(listNode, null);
        System.out.println(treeNode.val);
    }

    static TreeNode construcTreeFromLL(ListNode head, ListNode tail) {

        if (head == null) return null;

        if (head != tail) {
            ListNode middleNode = findMiddleNode(head, tail);
            TreeNode rootNode = new TreeNode(middleNode.val);

            rootNode.left = construcTreeFromLL(head, middleNode);
            rootNode.right = construcTreeFromLL(middleNode.next, tail);

            return rootNode;
        }
        return null;
    }

    static ListNode findMiddleNode(ListNode head, ListNode tail) {

        ListNode slowNode = head, fastNode = head;
        while (fastNode.next != tail && fastNode.next.next != tail) {
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }

        return slowNode;
    }
}
