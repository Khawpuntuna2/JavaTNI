package Customer;

import javax.swing.*;

public class RestaurantBill {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null,"Enter customer's name: ");
        double bill_amount = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter customer's bill:"));
        int member = JOptionPane.showConfirmDialog(null,"Do you have a member card?","Member",JOptionPane.YES_NO_OPTION);
        if(member==0){
            String memberType = JOptionPane.showInputDialog(null,"Enter a member level [Gold/Premium]:");
            Member bill = new Member(name,bill_amount,memberType);
            JOptionPane.showMessageDialog(null,bill);
        }
        else {
            Regular bill = new Regular(name,bill_amount);
            JOptionPane.showMessageDialog(null,bill);
        }
    }

}
