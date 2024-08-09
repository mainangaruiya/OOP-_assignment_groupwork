/**
 * 
 * Write Java program to ask student to enter the marks of the five units they did last semester,
compute the average and display it on the screen. (Average should be given in two decimal
places).
**/
import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total = 0;
        
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter marks for unit " + i + ": ");
            double marks = scan.nextDouble();
            total += marks;
        }

        
        double average = total / 5;

        
        System.out.printf("The average marks for the five units is: %.2f\n", average);

        scan.close();
    }
}
