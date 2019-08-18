package exercises;

import lombok.Data;

import java.util.Arrays;

public class Task3 {
    @Data
    public class Entry<K, V> {
        private final K key;
        private final V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
    public interface Table<K, V> {
        V get(K key);

        void put(V value);
    }
    public class TableImpl implements Table<String, Integer> {
        private Entry<String, Integer>[] entries = new Entry[10];

        @Override
        public Integer get(String key) {
            return Arrays.stream(entries).filter(s -> s.getKey() == key)
                    .findFirst()
                    .map(Entry::getValue)
                    .orElse(null);
        }

        @Override
        public void put(Integer value) {}
    }


}
