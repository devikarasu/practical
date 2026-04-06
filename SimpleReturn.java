public class SimpleReturn {

    public static int add(int a, int b) {
        return a + b;   // value return
    }

    public static void main(String[] args) {

        int result = add(10, 5);

        System.out.println("Sum = " + result);
    }
}