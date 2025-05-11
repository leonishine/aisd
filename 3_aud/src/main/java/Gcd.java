public class Gcd {

    public static void main(String[] args) {
        System.out.println(gcd(270,192));
    }

    public static int gcd(int a, int b) {
        if (b == 0 || a == 0 || a%b == 0 || b%a == 0 ) return b;
        return gcd(b, a%b);
    }

}
