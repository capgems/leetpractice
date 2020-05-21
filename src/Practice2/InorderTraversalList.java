package Practice2;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversalList {

    List inOrderTraversal(TreeNode root, List list) {

        List l = new ArrayList();

        if (root == null) return null;

        if (root.left != null) inOrderTraversal(root.left, l);
        l.add(root.val);
        if (root.right != null) inOrderTraversal(root.right, l);

        return l;
    }
}
