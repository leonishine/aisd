package homework4;

public class Problem2 {
    public static void main(String[] args) {
        //Задача 2.
        //Есть строка. Нужно развернуть строку так, чтобы каждое из слов осталось в естественном порядке.
        // Например. Input 1: A = "the sky is blue" Output 1: "blue is sky the" Input 2: A = "this is ib"
        // Output 2: "ib is this". Сложность линейная, с О(1) дополнительной памяти.

        String s = "the sky is blue";
        char end = s.charAt(s.length()-1);


        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) == ' ') {
                //Да, мы перебираем цикл в цикле, но на самом деле
                //внутренний цикл сделает суммарно почти n итераций за всё время работы,
                //то есть всего будет 2n операций = O(n).
                for (int j = i+1; (s.charAt(j) != ' ') ; j++) {
                    System.out.print(s.charAt(j));
                    if (s.charAt(j) == end) break;
                }
                System.out.print(' ');
            }
        }
        for (int j = 0; (s.charAt(j) != ' '); j++) {
            System.out.print(s.charAt(j));
            if (s.charAt(j) == end) break;
        }
        System.out.print(' ');




    }
}
