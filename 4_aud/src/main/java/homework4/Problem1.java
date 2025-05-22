package homework4;

public class Problem1 {
    public static void main(String[] args) {
        //Задача 1.
        //Дана последовательность различных чисел,
        // в которой все числа до определенного индекса j отсортированы по убыванию,
        // а после j по возрастанию. Найдите этот индекс j.  (Сложность O(log n).)

        int[] arr = {6,4,3,2,1,3,4,5,7,8,9};
        System.out.println(findJ(arr));
    }

    public static int findJ(int[] arr) {
        int l = 1;
        int r = arr.length-2;
        int m;

        while (true) {
            m = (l+r)/2;
            if (arr[m-1] < arr[m] && arr[m] < arr[m+1]) {
                r = m;
            } else if ( arr[m-1] > arr[m] && arr[m] > arr[m+1]) {
                l = m;
            } else {
                return m;
            }
        }
    }
}
