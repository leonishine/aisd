import java.util.Scanner;
import java.util.Stack;

public class MainProblem1 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.add(s.charAt(i));
            } else {
                stack.pop();
            }
        }
        System.out.println(stack.isEmpty());
    }
}
