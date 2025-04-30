import java.util.ArrayList;
import java.util.List;

public class MainSorterTest {
    public static void main(String[] args) {
        MySorter<Integer> mySorter = new MySorter<>();
        int[] l = {1,5,3,7,3,19,4,3,8,17};
        List<Integer> list = new ArrayList<>();
        for (Integer x : l) {
            list.add(x);
        }
        System.out.println(mySorter.pickSort(list,(x,y) -> x - y, false));
    }
}
