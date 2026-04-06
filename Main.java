import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int unit;  

        System.out.print("Enter units: ");
        unit = sc.nextInt(); 

        double bill;

        if (unit <= 100) {
            bill = 0;
        } 
        else if (unit <= 200) {
            bill = unit * 0.8;
        } 
        else if (unit <= 300) {
            bill = unit * 1.5;
        } 
        else {
            bill = unit * 2;
        }

        System.out.println("Total Bill = " + bill);
    }
}