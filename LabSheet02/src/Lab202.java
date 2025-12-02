import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        double stNumber = scanner.nextDouble();
        System.out.print("Enter number 2: ");
        double ndNumber = scanner.nextDouble();

        DecimalFormat frm = new DecimalFormat("#,###");

        double sum = stNumber + ndNumber , sub = stNumber - ndNumber,multi = stNumber * ndNumber,mod = stNumber%ndNumber,div = stNumber/ndNumber;

        System.out.println("\nSummation = "+frm.format(sum));
        System.out.println("Subtraction = "+frm.format(sub));
        System.out.println("Multiplication = "+frm.format(multi));
        System.out.println("Division = "+div);
        System.out.println("Modulus = "+frm.format(mod));

    }
}
