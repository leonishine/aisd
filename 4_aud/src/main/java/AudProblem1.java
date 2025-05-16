public class AudProblem1 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,4,5};
        int a = 2;
        int l = 0;
        int r = arr.length-1;
        int m;
        while (true) {
            m = (l+r)/2;
            if (arr[m] > a) {
                l = m;
            } else if (arr[m] < a) {
                r = m;
            } else {
                break;
            }
        }
        int i = m;
        int j = 0;
        int s;
        while (true) {
            s = (j+i)/2;
            if (arr[s] == a) {
                j = s;
            } else if (arr[s] < a) {
                i = s;
            } else {
                break;
            }
        }


        int p = arr.length;
        int q = m;
        int z;
        while (true) {
            z = (q+p)/2;
            if (arr[z] > a) {
                q = z;
            } else if (arr[z] == a) {
                p = z;
            } else {
                break;
            }
        }

        System.out.println(s + " " + z);
    }
}
