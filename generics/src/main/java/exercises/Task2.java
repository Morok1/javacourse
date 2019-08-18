package exercises;

public class Task2 {
    public interface Stack<E>{
        void push(E e);
    }
    public class StackImpl implements Stack<Double>{
        private int size;
        private Double[] doubles;
        private final static  int INCREASE_ARRAY = 10;

        public StackImpl(int size) {
            this.size = size;
            this.doubles = new Double[size];
        }

        @Override
        public void push(Double aDouble) {

            if(isFull()){
                Double[] doubles1 = new Double[this.size + INCREASE_ARRAY];
                System.arraycopy (this.doubles, 0, doubles1, 0, this.size);
                doubles1[size]  = aDouble;
                size++;
                this.doubles = doubles1;
            } else{
                doubles[size] = aDouble;
                size++;
            }


        }

        private boolean isFull(){
            return doubles.length == size;
        }
    }
}
