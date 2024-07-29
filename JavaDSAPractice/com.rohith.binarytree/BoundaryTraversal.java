public class BoundaryTraversal {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.constructBT();

        boundaryTraversal(bt.root);
    }
    public static void boundaryTraversal (TreeNode root) {
        if (root == null) return;

        System.out.print(root.data + " ");

        printBoundaryLeft(root.left);

        printLeaves(root.left);
        printLeaves(root.right);

        printBoundaryRight(root.right);
    }
    public static void printLeaves(TreeNode root) {
        if (root == null) return;

        printLeaves(root.left);
        if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
        }
        printLeaves(root.right);
    }
    public static void printBoundaryLeft(TreeNode root) {
        if (root == null) return;

        if (root.left != null) {
            System.out.print(root.data + " ");
            printBoundaryLeft(root.left);
        }else if (root.right != null) {
            System.out.print(root.data + " ");
            printBoundaryLeft(root.right);
        }
    }
    public static void printBoundaryRight(TreeNode root) {
        if (root == null) return;

        if (root.right != null) {
            printBoundaryRight(root.right);
            System.out.print(root.data + " ");
        } else if (root.left != null) {
            printBoundaryRight(root.left);
            System.out.print(root.data + " ");
        }
    }
}
