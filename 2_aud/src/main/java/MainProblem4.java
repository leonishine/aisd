import java.util.PriorityQueue;
import java.util.Queue;

public class MainProblem4 {
    public static void main(String[] args) {
        Queue<Integer> q1 = new PriorityQueue<>();
        q1.add(1);
        q1.add(2);
        q1.add(5);
        q1.add(7);

        Queue<Integer> q2 = new PriorityQueue<>();
        q2.add(1);
        q2.add(3);
        q2.add(4);
        q2.add(6);

        Queue<Integer> q3 = mergeQueue(q1,q2);
        q3.stream().forEach(x -> System.out.print(x + " "));
    }

    public static Queue<Integer> mergeQueue(Queue<Integer> q1, Queue<Integer> q2) {
        Queue<Integer> q3 = new PriorityQueue<>();
        while (!q1.isEmpty() || !q2.isEmpty()) {
            if (q1.isEmpty()) {
                q3.add(q2.poll());
            }
            else if (q2.isEmpty()) {
                q3.add(q1.poll());
            }
            else if (q1.peek() < q2.peek()) {
                q3.add(q1.poll());

            } else {
                q3.add(q2.poll());
            }
        }

        return q3;
    }
}
