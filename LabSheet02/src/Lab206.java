import javax.swing.*;
import java.text.DecimalFormat;

public class Lab206 {
    public static void main(String[] args) {
        final int buffetPrice = 299;
        int customer = Integer.parseInt(JOptionPane.showInputDialog("How many customer?: "));
        double priceTotal = (buffetPrice*customer);
        double priceNet = (buffetPrice*customer)+(priceTotal*7/100);
        DecimalFormat frm = new DecimalFormat("#,###.00");
        int coupon = Integer.parseInt(JOptionPane.showInputDialog("Price with NET is "+frm.format(priceNet)+" baht."+
                "\nHow much of discount(%) on your coupon?"));
        double discount = priceNet*coupon/100,discountPrice = priceNet-discount;

        double paid = Double.parseDouble(JOptionPane.showInputDialog("Total price is "+frm.format(discountPrice)+" baht."+
                "\nEnter the amount the customer paid"));
        double change = paid - discountPrice;
        JOptionPane.showMessageDialog(null,"Total price is "+frm.format(discountPrice)+" baht."+
                "\nCustomer paid "+frm.format(paid)+" baht."+"\nGet change "+frm.format(change)+" baht.");
    }
}
