import javax.swing.*;
import java.text.DecimalFormat;

public class Ex203 {
    public static void main(String[] args) {
        final double lecture_price = 1900;
        final double lab_price = 3500;

        int l_credit = Integer.parseInt(JOptionPane.showInputDialog("Enter lecture credit: "));
        int lab_credit = Integer.parseInt(JOptionPane.showInputDialog("Enter lab credit: "));

        double total_lec = lecture_price*l_credit;
        double total_lab = lab_price*lab_credit;
        double total = total_lab+total_lec;

        DecimalFormat frm = new DecimalFormat("#,###.00");
        JOptionPane.showMessageDialog(null,
                "Lecture: "+l_credit+"x"+lecture_price+"="+frm.format(total_lec)+
                "\nLaboratory: "+lab_credit+"x"+lab_price+"="+frm.format(total_lab)+
                "\nTotal price: "+frm.format(total));

    }
}
