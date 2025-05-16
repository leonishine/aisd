package homework3;

public class Problem1 {
    public static void main(String[] args) {
        Tree1 tree = new Tree1();
        Tree1.Node n4 = new Tree1.Node(4,null,null);
        Tree1.Node n5 = new Tree1.Node(5,null,null);
        Tree1.Node n9 = new Tree1.Node(9, n4, n5);
        Tree1.Node n3 = new Tree1.Node(3, null, null);
        Tree1.Node n7 = new Tree1.Node(7, n9, n3);

        tree.root = n7;

        tree.height(n7);
    }
}
