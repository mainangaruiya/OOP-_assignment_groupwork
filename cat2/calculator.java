import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = scan.nextDouble();

        System.out.println("Enter an operation (+, -, *, /): ");
        char operation = scan.next().charAt(0);

        System.out.println("Enter the second number: ");
        double num2 = scan.nextDouble();

        double result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("The result of " + num1 + " + " + num2 + " is: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("The result of " + num1 + " - " + num2 + " is: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("The result of " + num1 + " * " + num2 + " is: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The result of " + num1 + " / " + num2 + " is: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
                break;
        }
    }
}
