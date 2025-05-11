import java.util.Scanner;

public class Problem1LogFact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(logFact(sc.nextInt()));
    }

    public static double logFact(int n) {
        if (n == 1) return 0;
        return logFact(n-1) + Math.log(n);
    }
}
