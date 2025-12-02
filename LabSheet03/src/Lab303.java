import javax.swing.*;
import java.util.Scanner;

public class Lab303 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value for X coordinate: ");
        int x = scanner.nextInt();
        System.out.print("Enter the value for Y coordinate: ");
        int y = scanner.nextInt();
        if (x>0&&y>0) {
            System.out.println("The coordinate point ("+x+","+y+")"+" lies int the First quadrant");
        } else if (x<0&&y>0) {
            System.out.println("The coordinate point ("+x+","+y+")"+" lies int the Second quadrant");
        } else if (x<0&&y<0) {
            System.out.println("The coordinate point ("+x+","+y+")"+" lies int the Third quadrant");
        } else if (x>0&y<0){
            System.out.println("The coordinate point ("+x+","+y+")"+" lies int the Fourth quadrant");
        } else {
            System.out.println("The coordinate point ("+x+","+y+")"+" lies int the Origin");
        }
    }
}
