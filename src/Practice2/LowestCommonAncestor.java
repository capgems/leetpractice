package Practice2;

import java.util.Stack;

public class LowestCommonAncestor {

    public static void main(String[] args) {

    }

    static TreeNode lowestCommonAncestor(TreeNode node, TreeNode a, TreeNode b) {
        Stack<TreeNode> aElement = pathToElement(node, a.val);
        Stack<TreeNode> bElement = pathToElement(node, b.val);
        TreeNode lca = null;
        while (!aElement.empty() && !bElement.empty()) {
            TreeNode node1 = aElement.pop();
            TreeNode node2 = bElement.pop();
            if (node1.val == node2.val) {
                lca = node1;
                break;
            }
        }
        return lca;
    }

    static Stack<TreeNode> pathToElement(TreeNode node, Integer element) {


        if (element == node.val) {
            Stack stack = new Stack();
            stack.push(node);
            return stack;
        }

        Stack<TreeNode> leftPath = pathToElement(node.left, element);
        if (leftPath != null) {
            leftPath.push(node);
            return leftPath;
        }

        Stack<TreeNode> rigthPath = pathToElement(node.right, element);
        if (rigthPath != null) {
            rigthPath.push(node);
            return rigthPath;
        }

        return null;
    }
}
