import java.util.Random;
import java.util.Scanner;

public class Lab603 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your guess (0-20): ");
        int guess = sc.nextInt();
        System.out.println();
        int[] numbers = random_array();
        int sameNumber = count_element(numbers,guess);
        if (sameNumber>0)
        {
            System.out.println("Congratulation!! "+guess+" is an element in the array!!");
            if (sameNumber>1)
            {
                System.out.println("Fantastic!!! It also appears more than once!!");
            }
        } else {
            System.out.print("Sorry, try again next time...\n" +
                    "Here are the elements in the array: ");
            display_array(numbers);
        }
    }
    public static int[] random_array()
    {
        Random random = new Random();
        int[] numbers = new int[10];
        for (int i=0;i< numbers.length;i++)
        {
            numbers[i] = random.nextInt(21);
        }
        return numbers;
    }

    static int count_element(int[]numbers,int userguessNum)
    {
        int count = 0;
        for (int num :numbers )
        {
            if (num==userguessNum)count++;
        }
        return count;
    }

    static void display_array(int[]number)
    {
        for (int num:number)
        {
            System.out.print(num+" ");
        }
    }
}