package homework3;

public class Tree1 {
    public static class Node {
        public int value;
        public Tree1.Node left;
        public Tree1.Node right;

        public Node(int value, Tree1.Node left, Tree1.Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    public Tree1.Node root;

    public int height(Tree1.Node node) {
        if (node == null) return 0;
        int result = 1 +  Math.max(height(node.left), height(node.right));
        System.out.print(node.value + ": " + result + "\n");
        return (result);
    }

    public void travers(Tree1.Node node) {
        if (node == null) System.out.print("NULL");
        else {
            System.out.print("(" + node.value);
            System.out.print(", ");
            travers(node.left);
            System.out.print(", ");
            travers(node.right);
            System.out.print(")");
        }

    }
}

