//This program demostrates a user controlled loop.


import java.util.Scanner;
public class A57_TestAverage {
    public static void main(String [] args){

        int score1, score2, score3;
        double average;
        char repeat;
        String input;

        System.out.println("This program calculate the average of three test scores.");

        //create a scanner objecy for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        //Get as many sets of test scores as the user wants

        do
        {
            //Get the first test score in this set.
            System.out.print("Enter the score 1:  ");
            score1= keyboard.nextInt();

            //Get the second test score in this set.
            System.out.print("Enter the score 2: ");;
            score2 = keyboard.nextInt();

            //Get the third test score in this set.
            System.out.print("Enter the score 3: ");
            score3= keyboard.nextInt();

            //consume the remaining newline
            keyboard.nextLine();

            //calculate and print the average test score.
            average = (score1 + score2 + score3)/3.0;

            System.out.println("The average of test score is: " + average);
            System.out.println();

            //does the user want to average another set?

            System.out.println("Would you like to average another set of test score.");
            System.out.print("Enter Y for Yes and N for No.");

            input = keyboard.nextLine();

            repeat = input.charAt(0); //Get the first char

        } while(repeat == 'Y' || repeat == 'Y');
        keyboard.close();
    }
    
}
