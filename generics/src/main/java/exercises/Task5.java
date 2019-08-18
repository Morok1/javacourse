package exercises;

public class Task5 {
    public static <T> T[] swap(int  i, int j, T... values){
        T temp = values[i];
        values[j] = values[i];
        values[i] = temp;
        return values;
    }

    public static void main(String[] args) {
        Double[] result = Task5.<Double>swap(0, 1, 2.,3.);
    }
}
