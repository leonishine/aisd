public class Tree {
    public static class Node {
        public int value;
        public Tree.Node left;
        public Tree.Node right;

        public Node(int value, Tree.Node left, Tree.Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    public Tree.Node root;

    public void traversPre(Tree.Node node) {
        if (node == null) return;
        System.out.print(node.value);
        traversPre(node.left);
        traversPre(node.right);
    }

    public void traversPost(Tree.Node node) {
        if (node == null) return;
        traversPost(node.left);
        traversPost(node.right);
        System.out.print(node.value);
    }

    public void traversIn(Tree.Node node) {
        if (node == null) return;
        traversIn(node.left);
        System.out.print(node.value);
        traversIn(node.right);
    }

    public int countChildren(Tree.Node node) {
        if (node == null) return 0;
        int result = 1 + countChildren(node.left) + countChildren(node.right);
        System.out.print(node.value + ": " + result + "\n");
        return (result);
    }



}
