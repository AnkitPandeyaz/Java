//This program demonstrate a case insensitive string comparison

import java.util.Scanner;

public class A43_SecretWord {
    public static void main(String [] args){
        String input; //To hold the user's input

        //Create a scanner objects for keyboard input.
        
        Scanner keyboard = new Scanner(System.in);

        //pompt the user to enter the secret word.
        System.out.print("Enter the secret Word: ");
       input=keyboard.nextLine();

        if(input.equalsIgnoreCase("Ankit"))
        {
            System.out.println("Congratulation! You Know the Secret word!.");

        }
        else
        {
            System.out.println("Sorry, that is Not the secret word!");

        }
        keyboard.close();
    }
    
}
