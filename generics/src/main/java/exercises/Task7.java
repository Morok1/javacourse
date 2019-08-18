package exercises;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Task7 {
    @Data
    @AllArgsConstructor
    public class Pair<E extends Integer>{
        E value1;
        E value2;

    }
}
