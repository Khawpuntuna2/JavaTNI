import javax.swing.*;

public class ProductMain {
    public static void main(String[] args) {
        Product s1 = new Product();
        JOptionPane.showMessageDialog(null,"Welcome to Product Stock System");
        s1.name=JOptionPane.showInputDialog("Enter product name:");
        s1.price=Double.parseDouble(JOptionPane.showInputDialog("Enter product price per item:"));
        s1.quantity=Integer.parseInt(JOptionPane.showInputDialog("Enter product stock:"));


        s1.showInfo();

        int addMore = JOptionPane.showConfirmDialog(null,"Do you want to add more item?",
                "Select an Option",JOptionPane.YES_NO_CANCEL_OPTION);
        if (addMore==JOptionPane.YES_OPTION)
        {
            s1.addStock(Integer.parseInt(JOptionPane.showInputDialog("How many item to add in stock?")));
        }



        int changePrice = JOptionPane.showConfirmDialog(null,"Do you want to change price?",
                "Select an Option",JOptionPane.YES_NO_CANCEL_OPTION);
        if (changePrice==JOptionPane.YES_OPTION)
        {
            s1.changePrice(Double.parseDouble(JOptionPane.showInputDialog("How much is the new price per items?")));
        }
        s1.showInfo();

    }
}
