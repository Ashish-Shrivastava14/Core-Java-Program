package Methods;

import java.util.Scanner;

public class StringLearn {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Name");
        String firstName = sc.nextLine();

        System.out.println("Enter your last name:");
        String LastName = sc.nextLine();

        System.out.println("Your full name is " +firstName+" "+LastName);
    }
}
