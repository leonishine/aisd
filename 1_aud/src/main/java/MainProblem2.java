import java.util.Scanner;
import java.util.Stack;

public class MainProblem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(test(s));
    }

    public static boolean test(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.add(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.peek() - s.charAt(i) == -1 || stack.peek() - s.charAt(i) == -2) {
                    stack.pop();
                } else {
                    return false;
                }

            }
        }
        return (stack.isEmpty());
    }
}
