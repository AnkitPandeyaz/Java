//This program  demonstrates the switch statement

import java.util.Scanner;

public class A45_SwitchDemo {
    public static void main(String[] args){
        int number; //A number entered by the user
        //create a scanner object for keyboard input 

        Scanner keyboard = new Scanner(System.in);

        //get one of the number 1, 2, or 3 from the user

        System.out.print("Enter 1, 2, 3 : ");

        number= keyboard.nextInt();

        //Determine the number entered

        switch(number)
        {
            case 1:
            System.out.println("You entered 1.");
            break;

            case 2:
            System.out.println("You entered 2.");
            break;

            case 3:
            System.out.println("You entered 3");
            break;
            
            default:
            System.out.println("That's not 1, 2, or 3!");
        }

        keyboard.close();
    }

}
