public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.constructBT();

        bt.preOrder(bt.root);
        System.out.println();
        bt.preOrderItr(bt.root);
        System.out.println();

        bt.inOrder(bt.root);
        System.out.println();
        bt.inOrderItr(bt.root);
        System.out.println();

        bt.postOrder(bt.root);
        System.out.println();
        bt.postOrderItr(bt.root);
        System.out.println();

        System.out.println(bt.max(bt.root));
        System.out.println(bt.min(bt.root));
    }
}
