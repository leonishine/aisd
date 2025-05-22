package homework5;

import java.util.Arrays;

public class Problem4 {
    public static void main(String[] args) {
        //Задача 4
        //Дан список неотрицательных чисел и некоторое число s.
        // Необходимо вывести мксимальное количество чисел из списка,
        // сумма которых не превышает s. Пример: [15, 5, 11, 10, 12], s = 30,
        // тогда ответ будет 3 (например, 5 + 10 + 11 < 30)

        int[] arr = {15, 5, 11, 10, 12};
        int s = 30;
        int c = 0;

        arr = Arrays.stream(arr).sorted().toArray();
        int i = 0;
        while (c <= s) {
            c += arr[i];
            if (c > s) break;
            i++;
        }

        System.out.println(i);
    }
}
