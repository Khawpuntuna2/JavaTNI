import javax.swing.*;

public class Lab205 {
    public static void main(String[] args) {
        int inputMin = Integer.parseInt(JOptionPane.showInputDialog("Input minutes: "));
        int hour = inputMin/60,min = inputMin%60;
        JOptionPane.showMessageDialog(null,inputMin+" minutes is "+hour+" hour "+min+" minute ");
    }
}
