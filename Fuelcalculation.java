import java.util.Scanner;

class Fuelcalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance (km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter mileage (km/l): ");
        double mileage = sc.nextDouble();

        System.out.print("Enter fuel price (per litre): ");
        double price = sc.nextDouble();

       
        double fuel = distance / mileage;
        double totalCost = fuel * price;

  
        System.out.println("Fuel needed = " + fuel + " litres");
        System.out.println("Total cost = " + totalCost);
    }
}