import java.util.Scanner;
import java.util.Stack;

public class MainProblem1 {
    public static void main(String[] args) {
        //Сколько надо удалить чтобы строка стала правильной последовательностью

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        withStack(str);
        withoutStack(str);

    }

    public static void withStack(String str) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.add('(');
            } else {
                if (stack.isEmpty()) {
                    count++;
                } else {
                    stack.pop();
                }
            }
        }
        count += stack.size();
        System.out.println(count);
    }

    public static void withoutStack(String str) {
        int skob = 0;
        int countDelete = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                skob++;
            } else {
                if (skob == 0) {
                    countDelete++;
                } else {
                    skob -= 1;
                }
            }
        }
        countDelete += skob;
        System.out.println(countDelete);
    }
    /*
    public static void withoutStackAllTypes(String str) {
        int round = 0;
        int square = 0;
        int figured = 0;
        int countDelete = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case ('(') -> round++;
                case
            }

        }
        countDelete += skob;
        System.out.println(countDelete);
    }
     */

}