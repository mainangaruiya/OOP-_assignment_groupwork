import java.util.Scanner;

public class surname{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your surname: ");
        String surname = scan.nextLine();

        
        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        int length = surname.length();
        String ageType = (age % 2 == 0) ? "even" : "odd";

        
        System.out.println("The number of characters in your surname is " + length + ".");
        System.out.println("Your current age is an " + ageType + " number.");
        
        
        scan.close();



	}
}

/*Write a Java program that asks the user to enter their sur name
 and current age then print the
number of characters of their sir name and even or odd depending 
on their age number.
Example of Expected result:
If sir name is Saruni and age is 29, output will be;
then the number of characters is 6.
Your current age is an odd number*/