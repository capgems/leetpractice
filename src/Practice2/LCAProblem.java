package Practice2;

//awesome problem.
public class LCAProblem {

    TreeNode lowestCommonAncestor(TreeNode node, TreeNode p, TreeNode q) {

        if (node == null) return null;

        if (p.val == node.val || q.val == node.val) {
            return node;
        } else {
            TreeNode l = lowestCommonAncestor(node.left, p, q);
            TreeNode r = lowestCommonAncestor(node.right, p, q);
            if (l == null || r == null) {
                return l == null ? r : l;
            } else {
                return node;
            }
        }
    }
}
