import java.util.Comparator;
import java.util.List;

public class MySorter<T> {
    public List<T> pickSort(List<T> list, Comparator<T> comparator, boolean asc) {
        for (int i = 0; i < list.size(); i++) {
            int minInd = i;
            for (int j = i; j < list.size(); j++) {
                if ((comparator.compare(list.get(minInd), list.get(j)) > 0) == asc) {
                    minInd = j;
                }
            }
            T temp = list.get(i);
            list.set(i, list.get(minInd));
            list.set(minInd, temp);
        }
        return list;
    }


}
