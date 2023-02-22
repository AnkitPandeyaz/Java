//This program demonstrates a switch statement.

import java.util.Scanner;

public class A47_PetFood {
    public static void main(String [] args){
        String input;
        char foodGrade;


        //Create a scanner object for keyboard input.

        Scanner keyboard = new Scanner(System.in);

        //prompt the user for a grade of pet food.
        System.out.println("Our pet food is available in three grades:");
        System.out.print("A ,B, and C. Which do you want pricing for ?");

        input= keyboard.nextLine();
        foodGrade= input.charAt(0);

        //Display pricing for the selected grade.

        switch(foodGrade)
        {
            case 'a':
            case 'A':
            System.out.println("300 Rupees for One Packet.");
            break;

            case 'b':
            case 'B':
            System.out.println("200 Rupees for one Packet.");
            break;

            case 'c':
            case 'C':
            System.out.println("150 Rupees for One packet.");
            break;

            default:
            System.out.println("Invalid choice.");
        }
        keyboard.close();
    }
    
}
