import javax.swing.*;

public class Lab307 {
    public static void main(String[] args) {
        double total=0;
        double price;
        do {
            price = Double.parseDouble(JOptionPane.showInputDialog("Input price [press 0 to stop]:"));
            if (price < 0) {
                price = Double.parseDouble(JOptionPane.showInputDialog("Invalid price!!\nInput price [press 0 to stop]:"));
            }
            total +=price;
        } while (price !=0);
        JOptionPane.showMessageDialog(null,"Total price is "+total+" baht.");
    }
}
