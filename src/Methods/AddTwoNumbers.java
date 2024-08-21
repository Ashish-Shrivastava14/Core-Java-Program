package Methods;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[]ars){
        //creating an object of scanner class

        Scanner sc = new Scanner(System.in);

        // Reading two integer numbers
        // using nextInt() method
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();

        //calculate the sum
        int sum = num1 + num2;

        // printing the sum
        System.out.println("Thge sum of the two number is: " +sum);
    }
}
