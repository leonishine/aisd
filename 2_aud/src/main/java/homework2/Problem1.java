package homework2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = "Яблоко яблоко шимпанзе четыре яблока яблоко носок шимпанзе";
        Map<String, Integer> map = countWords(s);
    }

    public static Map<String, Integer> countWords(String s) {
        Map<String, Integer> map =
                Arrays.stream(s.split("[^A-Za-zА-Яа-я]"))
                .collect(Collectors.toMap(
                        st -> st,
                        st -> 1,
                        (x, y) -> (x + y)
                ));

        System.out.println(map.entrySet());

        return map;
    }
}
