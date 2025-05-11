public class GoodList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;

    public void add (int value) {
        if (head == null) {
            head = new Node(value, null);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(value, null);
        }

    }

    public void turn(int pos) {
        int curp = 0;
        Node current = head;
        Node temp = head;
        while (current.next != null) {
            curp++;
            if (curp == pos) {
                temp = current;
            }
            current = current.next;
        }
        current.next = temp;
        head = current;
        turn(pos+1);

    }


    public static void main(String[] args) {
        GoodList gl = new GoodList();
        gl.add(1);
        gl.add(2);
        gl.add(3);
        gl.add(4);
        gl.add(5);

        gl.turn(1);

        Node current = gl.head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }

    }

}
