import java.util.Arrays;

public class SubsetSum {
    public static void main(String[] args) {
        System.out.println(sum(new int[] {1,3,5}, 0, 7));
    }

    public static boolean sum(int[] a, int pos, int n) {
        if (n == 0) return true;

        if (a.length == (pos+1) && a[pos] == n) {
            System.out.println(n);
            return true;
        }
        int cur = a[pos];
        return sum(a, pos+1, n-cur) || sum(a, pos+1, n);
    }
}
