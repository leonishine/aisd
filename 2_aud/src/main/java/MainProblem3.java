import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class MainProblem3 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int[] arr = {1,1,1,3,3,5,6,6,7,8,8,8};
        Arrays.stream(f(arr)).forEach(System.out::println);
    }

    public static int[] f(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i : arr) {
            if (stack.isEmpty() || !stack.peek().equals(i)) {
                stack.add(i);
            }
        }
        return stack.stream().mapToInt(x -> x).toArray();
    }
}
