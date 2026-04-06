import java.util.Scanner;

class Temperature{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double tempDouble = sc.nextDouble();

        int tempInt = (int) tempDouble;

      
        double difference = tempDouble - tempInt;

        // output
        System.out.println("Double value = " + tempDouble);
        System.out.println("Integer value = " + tempInt);
        System.out.println("Difference = " + difference);
    }
}