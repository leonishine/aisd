import java.util.Scanner;
import java.util.Stack;

public class MainProblem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(calculate(str));
    }

    public static int calculate(String str) {
        /*
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                System.out.println("vze");
            }
            else if (str.charAt(i) == '+') {
                int res = 0;
                for (Integer x : stack) {
                    res += x;
                }
                stack.clear();
                stack.add(res);
            }
            else if (str.charAt(i) == '-') {
                int res = 0;
                boolean first = true;
                for (Integer x : stack) {
                    if (first) {
                        res += x;
                        first = false;
                    } else {
                        res -= x;
                    }
                }
                stack.clear();
                stack.add(res);
            }
            else if (str.charAt(i) == '*') {
                int res = 1;
                for (Integer x : stack) {
                    res *= x;
                }
                stack.clear();
                stack.add(res);

            }
            else {
                stack.add(Integer.parseInt(String.valueOf(str.charAt(i))));
            }
        }
        System.out.println(stack);
        return stack.peek();

         */
        return 0;
    }


}
