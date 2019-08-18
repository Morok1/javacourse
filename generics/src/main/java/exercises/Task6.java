package exercises;

import java.util.List;

public class Task6 {
    public <T extends Number> void join(List<T> list1, List<T>  list2){
        list1.addAll(list2);
    }


}
