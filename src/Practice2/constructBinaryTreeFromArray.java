package Practice2;

public class constructBinaryTreeFromArray {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        TreeNode node = constructTree(array, 0, array.length-1, new TreeNode());
        System.out.println(node.val);
    }

    static TreeNode constructTree(int array[], int start, int end, TreeNode root) {


        if (end > array.length) return null;

        if (start > end) return null;

        int mid = (start + end) / 2;

        root = new TreeNode(array[mid]);

        root.left = constructTree(array, start, mid - 1, root.left);
        root.right = constructTree(array, mid + 1, end, root.right);

        return root;
    }
}
