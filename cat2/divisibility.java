/**
 * Write a program that will help kids learn divisibly test of numbers of integers. The program
should check whether the given integer is divisible by integers in the range of 0-9. For
example, if a number (955) is divisible by five, the program should print, the number is
divisible by 5 because it ends with a 5, and 900 is divisible by 5 because it ends with a
0(zero).
 * 
 * **/

 import java.util.Scanner;

public class divisibility {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        System.out.println("Enter an integer: ");
        int number = scan.nextInt();

        
        for (int i = 1; i <= 9; i++) {
            if (number % i == 0) {
                System.out.println(number + " is divisible by " + i);
            }
        }

        // Special message for divisibility by 5 based on last digit
        int lastDigit = number % 10;
        if (lastDigit == 0 || lastDigit == 5) {
            System.out.println(number + " is divisible by 5 because it ends with " + lastDigit);
        }

        // Close the scanner
        scan.close();
    }
}
