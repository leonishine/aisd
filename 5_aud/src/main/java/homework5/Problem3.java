package homework5;

import java.util.Arrays;
import java.util.Comparator;

public class Problem3 {
    public static void main(String[] args) {
        //Задача 3
        //Дан список неотрицательных чисел. Измените их порядок так, чтобы если их после этого выписать в строку,
        // то получилось максимальное из возможных чисел. Пример: дан массив [3, 30, 34, 5, 9].
        // Максимальное возможное число можно получить 9534330. Сложность O(n log n)

        int[] arr = {9, 34, 30, 3, 5};
        String[] arr2 = Arrays.stream(arr)
                .mapToObj(String::valueOf)
                .sorted((s1, s2) -> (s2+s1).compareTo(s1+s2) )
                .toArray(String[] :: new);

        String numString = "";
        for (String i : arr2) {
            numString += i;
        }
        int answer = Integer.parseInt(numString);
        System.out.println(answer);
    }
}
