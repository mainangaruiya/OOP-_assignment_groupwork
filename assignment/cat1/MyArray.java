import java.util.Arrays;
import java.util.Scanner;

public class MyArray {
    public static void main(String[] args) {
        int[] numbers = new int[15];
        Scanner scanner = new Scanner(System.in);

        // Input 15 integers into the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter value for index " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        // a) Print the values stored in the array
        System.out.println("Array elements: " + Arrays.toString(numbers));

        // b) Check if a user-entered number is in the array
        System.out.print("Enter a number to check if it's in the array: ");
        int numberToCheck = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numberToCheck) {
                index = i;
                break;
            }
        }
        if (index >= 0) {
            System.out.println("The number found at index " + index);
        } else {
            System.out.println("Number not found in this array.");
        }

        // c) Sort the array in ascending order and print it
        Arrays.sort(numbers);
        System.out.println("Array elements in ascending order: " + Arrays.toString(numbers));

        // d) Create a reversed array and print it
        int[] reversedArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversedArray[i] = numbers[numbers.length - 1 - i];
        }
        System.out.println("Reversed array elements: " + Arrays.toString(reversedArray));

        // Palindrome check
        System.out.print("Enter a number to check if it's a palindrome: ");
        int palindromeCheck = scanner.nextInt();
        System.out.println(palindromeCheck + (isPalindrome(palindromeCheck) ? " is" : " is not") + " a palindrome.");

        // e) Calculate and print the sum and product of the array elements
        int sum = 0;
        int product = 1;
        for (int num : numbers) {
            sum += num;
            product *= num;
        }
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Product of all elements: " + product);

        scanner.close();
    }

    // Helper function to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int original = number, reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return original == reversed;
    }
}
