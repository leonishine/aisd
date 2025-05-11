public class TreeMain {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Tree.Node n4 = new Tree.Node(4,null,null);
        Tree.Node n5 = new Tree.Node(5,null,null);
        Tree.Node n9 = new Tree.Node(9, n4, n5);
        Tree.Node n3 = new Tree.Node(3, null, null);
        Tree.Node n7 = new Tree.Node(7, n9, n3);

        tree.root = n7;

        tree.countChildren(n7);
    }
}
