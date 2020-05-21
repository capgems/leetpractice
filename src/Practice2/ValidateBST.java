package Practice2;

public class ValidateBST {

    public static void main(String[] args) {
        TreeNode node =
                new TreeNode(4,
                        new TreeNode(1, new TreeNode(0), new TreeNode(2)),
                        new TreeNode(5, new TreeNode(4), new TreeNode(6)));

        System.out.println(validateBST(node, null,null));
    }


    static boolean validateBST(TreeNode node, Integer max, Integer min) {

        boolean left = true, right = true;

        if (min !=null && min > node.val) {
            return false;
        }

        if (max != null && max < node.val) {
            return false;
        }

        if (node.left != null) left = validateBST(node.left, node.val, min);
        if (node.right != null) right = validateBST(node.right, max, node.val);

        return left && right;
    }

}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}