package exercises;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task12 {
    public static <T> void minMax(List<T> elements, Comparator<? super T> comp, List<? super T> result){
        Collections.sort(elements, comp);
        result.add(elements.get(0));
        result.add(elements.get(elements.size()));
    }
}
