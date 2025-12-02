import java.util.Scanner;

public class EX302 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter mid-term  score: ");
        int midterm = scanner.nextInt();

        System.out.print("Enter final     score: ");
        int Final = scanner.nextInt();

        int total = midterm+Final;

        if(total >100 || total < 100) {
            System.out.print("Error score");
        } else {
            if (total >= 80) {
                System.out.print("You get grade A");
            } else if (total>=70) {
                System.out.print("You get grade B");
            } else if (total>=60) {
                System.out.print("You get grade C");
            } else if (total>=50) {
                System.out.print("You get grade D");
            } else {
                System.out.print("You get grade F");
            }
        }
    }
}
