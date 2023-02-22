//This program demonstrate the switch statement with no break

import java.util.Scanner;
public class A46_NoBreaks {
    public static void main(String [] args){
        int number; // a number entered by the user

        //create a scanner object for keyboard input 
        Scanner keyboard= new Scanner(System.in);

        //get one of the number 1, 2, or 3 from the user

        System.out.print("Enter the number 1, 2, or 3: ");
        number = keyboard.nextInt();

        //Determine the number entered

        switch(number)
        {
            case 1:
            System.out.println("You entered 1.");

            case 2:
            System.out.println("You entered 2.");

            case 3:
            System.out.println("You entered 3.");

            default:
            System.out.println("That's not 1, 2, or3!");
        }

        keyboard.close();
    }
    
}
