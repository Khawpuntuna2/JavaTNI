package CoffeeShop;

import java.util.Scanner;

public class CoffeeShop {
    static int EspressoCount = 0;
    static int FrappucinoCount = 0;
    public static Espresso orderEspresso(){
        EspressoCount++;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a size: ");
        String size =scanner.nextLine();
        return  new Espresso(size);



    }
    public static Frappuccino orderFrappucino(){
        FrappucinoCount++;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a size: ");
        String size =scanner.nextLine();
        System.out.print("Do you would like to add whipped cream [y/Y]?: ");
        String whip = scanner.nextLine();

        return new Frappuccino(size,whip.equalsIgnoreCase("y"));

    }

    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nPress 1 for ordering Espresso" +
                    "\nPress 2 for ordering Frappuccino");
            System.out.print("Enter an option: ");
            int option = scanner.nextInt();
            if (option == 1) orderEspresso();
            else if (option == 2) orderFrappucino();
            System.out.print("Do you want to order more [y/Y]?");
            String more_order = scanner.nextLine();

        }
    }
}
