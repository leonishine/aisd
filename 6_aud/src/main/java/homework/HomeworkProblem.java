package homework;

public class HomeworkProblem {
    public static void main(String[] args) {
        long s = 0b10011011;
        long t = 0b10111010;

        System.out.println(karatsubaMultiply(s, t));
    }

    public static long karatsubaMultiply(long x, long y) {
        if (x == 0 || y == 0) return 0;
        if (x == 1) return y;
        if (y == 1) return x;

        int n = Math.max(Long.toBinaryString(x).length(), Long.toBinaryString(y).length());
        if (n % 2 != 0) n++;

        long half = (long) Math.pow(2, n / 2);
        long a = x >> (n / 2);
        long b = x & (half - 1);
        long c = y >> (n / 2);
        long d = y & (half - 1);

        long ac = karatsubaMultiply(a, c);
        long bd = karatsubaMultiply(b, d);
        long aPlusB = binaryAdd(a, b);
        long cPlusD = binaryAdd(c, d);
        long abcd = karatsubaMultiply(aPlusB, cPlusD);

        long adPlusBc = binarySubtract(binarySubtract(abcd, ac), bd);

        return binaryAdd(binaryAdd(ac << n, adPlusBc << (n / 2)), bd);
    }

    public static long binaryAdd(long a, long b) {
        while (b != 0) {
            long temp = a & b;
            a = a ^ b;
            b = temp << 1;
        }
        return a;
    }

    public static long binarySubtract(long a, long b) {
        while (b != 0) {
            long temp = (~a) & b;
            a = a ^ b;
            b = temp << 1;
        }
        return a;
    }
}