import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class TicketInfo {
    public static String select_showtime(Movie movie){
        int number = Integer.parseInt(JOptionPane.showInputDialog(movie.toString()+"\nPress 1 to select show time = 13:00"+
                "\nPress 2 to select show time = 14.30"+"\nPress 3 to select show time = 15:00"+
                "\nEnter a number"));
        if (number==1) return "13:00";
        if (number==2) return "14:30";
        if (number==3) return "15:00";
        return "Error time";
    }

    public static String select_seat_number(){
        String row = JOptionPane.showInputDialog(null,"Select seat row [A-G]");
        char row_upper = row.toUpperCase().charAt(0);
        int number = Integer.parseInt(JOptionPane.showInputDialog("Select seat number [1-12]"));
        return  row_upper + Integer.toString(number);
    }

    public static void main() {
        Movie movie = new Movie("Titanic",120,"PG-13");
        String show_time = select_showtime(movie);
        String seat_number = select_seat_number();
        Ticket ticket = new Ticket("T001",movie,show_time,seat_number,240);
        JOptionPane.showMessageDialog(null,ticket.bookTicket()+ticket.bookTicket());
    }
}
