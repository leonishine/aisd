package homework2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.Math.abs;

public class Problem2 {
    public static void main(String[] args) {

//        Задача 2
//Дан массив целых чисел и число k. Определить, есть ли в массиве такие два различных индекса i и j, что nums[i] == nums[j] и |i - j| <= k
//Пример:
//[1, 2, 3, 1, 5], k = 3
//Вывод: true (индекс 0 и 3, расстояние 3)

        int[] arr = {1, 2, 3, 1, 5};
        int k = 3;
        int m = 1000;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            if (map.containsKey(n) && Math.abs(i - map.get(n)) < m) {
                    m = Math.abs(i - map.get(n));
            }
            map.put(n, i);
        }

        System.out.println(m <= k);
    }
}
