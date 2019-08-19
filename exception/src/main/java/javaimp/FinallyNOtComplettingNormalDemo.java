package javaimp;

public class FinallyNOtComplettingNormalDemo {
    public static int parseInt(String number){
        try {
            int result = Integer.parseInt(number);
            return result;
        } catch (NumberFormatException e) {
            System.err.println(e.getCause());
        } finally {
            return -1;
        }
    }

    public static void main(String[] args) {
        int result = parseInt("12");
        System.out.println("Result" + result);

    }
}
