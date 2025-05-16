package homework3;

import java.util.List;

public class Problem3 {
    public static void main(String[] args) {
        NTree tree = new NTree();
        NTree.Node n4 = new NTree.Node(4, null);
        NTree.Node n5 = new NTree.Node(5,null);
        NTree.Node n9 = new NTree.Node(9, List.of(n4, n5));
        NTree.Node n3 = new NTree.Node(3, null);
        NTree.Node n1 = new NTree.Node(1, null);
        NTree.Node n7 = new NTree.Node(7, List.of(n9, n3, n1));

        tree.root = n7;

        tree.travers(n7);
    }
}
