package homework2;

import java.util.*;
import java.util.stream.Collectors;

public class Problem3 {
    public static void main(String[] args) {
//        Задача 3
//Даны два массива целых чисел. Вернуть массив их общих элементов,
// где количесвто вхождений каждого элемента равно минимальному из его встречаемости в обоих массивах
//Пример:
//[2, 4, 4, 1], [2, 2, 4, 5]
//Вывод:
//[2, 4]

        int[] a = {2, 4, 4, 1};
        int[] b = {2, 2, 4, 5};

        Map<Integer, Integer> mapa = new HashMap<>();
        Map<Integer, Integer> mapb = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            int n = a[i];
            if (mapa.containsKey(n)) {
                mapa.put(n, mapa.get(n) + 1);
            } else {
                mapa.put(n, 1);
            }
        }

        for (int i = 0; i < b.length; i++) {
            int n = b[i];
            if (mapb.containsKey(n)) {
                mapb.put(n, mapb.get(n) + 1);
            } else {
                mapb.put(n, 1);
            }
        }

        Map<Integer, Integer> mapc = new HashMap<>();
        mapc.putAll(mapa.entrySet()
                .stream()
                .filter(e -> mapb.containsKey(e.getKey()))
                .collect(Collectors.toMap(
                        x -> x.getKey(),
                        x -> x.getValue(),
                        (x, y) -> Math.min(x, y)
                )));
        System.out.println(mapc);
        mapc.putAll(mapb.entrySet()
                .stream()
                .filter(e -> mapa.containsKey(e.getKey()))
                .collect(Collectors.toMap(
                        x -> x.getKey(),
                        x -> x.getValue(),
                        (x, y) -> {
                            System.out.println(x + " " + y);
                            return Math.min(x, y);
                        }
                )));

        System.out.println(mapc);

        Optional<Integer> l = mapc.entrySet().stream().map(x -> x.getValue()).reduce((x, y) -> x + y);
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        mapc.entrySet().stream().forEach( x -> {
                    for (int j = 0; j < x.getValue(); j++) {
                        ans.add(x.getKey());
                    }
                }
        );
        Integer[] answer = ans.toArray(new Integer[l.get()]);

        for (Integer x : answer) {
            System.out.print(x + " ");
        }
    }
}
