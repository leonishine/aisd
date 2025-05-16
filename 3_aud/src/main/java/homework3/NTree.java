package homework3;

import java.util.List;

public class NTree {
    public static class Node {
        public int value;
        public List<Node> children;

        public Node(int value, List<Node> children) {
            this.value = value;
            this.children = children;
        }
    }

    public NTree.Node root;

    public void travers(NTree.Node node) {
        if (node.children == null || node.children.isEmpty()) {
            System.out.print("(" + node.value + ", NULL)");
        } else {
            System.out.print("(" + node.value);
            node.children.forEach(x -> {
                System.out.print(", ");
                travers(x);
            });
            System.out.print(")");
        }
    }
}
