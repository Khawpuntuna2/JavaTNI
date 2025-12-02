import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab203 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product id: ");
        String id = scanner.nextLine();
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter product item: ");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter product piece: ");

        double price_per_item = Double.parseDouble(scanner.nextLine());
        System.out.println("------------------------------------------------");

        DecimalFormat frm = new DecimalFormat("#,###.00");

        System.out.println("Product name: "+name+" ("+id+")");
        System.out.println("Product item: "+amount+" ("+price_per_item+" baht/piece)");
        double total_price = amount*price_per_item;
        System.out.println("Total price : "+frm.format(total_price)+" baht");
    }
}
