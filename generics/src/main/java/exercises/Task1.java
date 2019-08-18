package exercises;

public class Task1 {
    public interface Stack<E>{
        void push();
        E pop();
        boolean isEmpty();
    }

    public class StackImpl implements Stack<Integer>{

        @Override
        public void push() {

        }

        @Override
        public Integer pop() {
            return null;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }
    }
}
