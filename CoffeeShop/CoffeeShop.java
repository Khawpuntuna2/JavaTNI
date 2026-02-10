package CoffeeShop;

import java.util.Scanner;

public class CoffeeShop {
    static int EspressoCount = 0;
    static int FrappucinoCount = 0;
    static double totalPrice = 0;
    static Scanner scanner = new Scanner(System.in);

    public static Espresso orderEspresso(){
        EspressoCount++;
        System.out.print("Enter a size: ");
        String size = scanner.nextLine();
        Espresso es = new Espresso(size);
        System.out.print("Press 'y' or 'Y' for adding a shot: ");
        String shot = scanner.nextLine();
        if (shot.equalsIgnoreCase("y")) {
            System.out.print("How many shots for adding in Espresso: ");
            int numShots = scanner.nextInt();
            scanner.nextLine();
            es.addShot(numShots);
        }
        totalPrice += es.calculateFinalPrice();
        System.out.println(es);
        return es;
    }

    public static Frappuccino orderFrappucino() {
        FrappucinoCount++;

        System.out.print("Enter a size: ");
        String size = scanner.nextLine();
        System.out.print("Do you would like to add whipped cream [y/Y]? ");
        String whip = scanner.nextLine();
        Frappuccino fp = new Frappuccino(size, whip.equalsIgnoreCase("y"));
        totalPrice += fp.calculateFinalPrice();
        System.out.println(fp);
        return fp;
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nPress 1 for ordering Espresso" +
                    "\nPress 2 for ordering Frappuccino");
            System.out.print("Enter an option: ");
            if (!scanner.hasNextInt()) {
                scanner.nextLine();
                continue;
            }

            int option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1) orderEspresso();
            else if (option == 2) orderFrappucino();
            if (option == 1 || option == 2) {
                System.out.print("\nDo you want to order more [y/Y]? ");
                String order = scanner.nextLine();
                if (!order.equalsIgnoreCase("y")) break;
            }
        }

        System.out.println("\nYou ordered " + EspressoCount + " Espresso");
        System.out.println("You ordered " + FrappucinoCount + " Frappuccino");
        System.out.println("Total Price = "+totalPrice+" baht");
    }
}