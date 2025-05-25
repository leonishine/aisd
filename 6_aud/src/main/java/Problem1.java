public class Problem1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        System.out.println(maxim(arr,0, arr.length));
    }

    public static int maxim(int[] arr, int start, int end) {
        if (start == end - 1) return arr[start];
        return Math.max(maxim(arr, start,(start + end)/ 2), maxim(arr, (start + end) / 2, end));
    }
}
