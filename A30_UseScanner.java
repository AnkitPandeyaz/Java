//This program show the scanner class begin used to read a String, an int, and a double.

import java.util.Scanner;

public class A30_UseScanner {
    public static void main(String[] args) {
        String name; // to hold a name
        int hours; // hours works
        double payRate; // hourly pay rate
        double grossPay; // Gross pay

        // creating a scanner object to read input

        Scanner keyboard = new Scanner(System.in);

        // To get the user name

        System.out.print("Enter Your Name: \n");
        name = keyboard.nextLine();

        // Get the number of hours works this week

        System.out.print("How many Hours did you work this week? \n");
        hours = keyboard.nextInt();

        // get the user's hourly pay rate

        System.out.print("What is the hourly pay rate? \n");
        payRate = keyboard.nextDouble();

        // Calculate the grossPay

        grossPay = hours * payRate;

        // Display the result information

        System.out.println("Hello " + name);
        System.out.println("Your gross pay is $" + grossPay);
        keyboard.close();

    }

}
