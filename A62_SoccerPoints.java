//This program calculate the total number of points a soccer team has earnd over a series of games. 
//The user enters a series of point values, then -1 when finished.

import java.util.Scanner;
public class A62_SoccerPoints {
    public static void main(String[] args) {
        int points; //Game points
        int totalPoints = 0; //accumulator initialized to 0


        //create a scanner object for keyboard input

        Scanner keyboard = new Scanner(System.in);

        //Display general instructions
        System.out.println("Enter the number of points your team has earned for each game this season.");
        System.out.println("Enter -1 when finished.");
        System.out.println();


        //Get the first number of points
        System.out.print("Enter game points or -1 to end: ");
        points = keyboard.nextInt();

        //accumulate the points unti -1 is entered

        while(points !=-1)
        {
            //Add points to totalpoints

            totalPoints +=points;

            //Get the next number of points
            System.out.print("Enter game points or -1 to end : ");
            points = keyboard.nextInt();
        }

        //Display the total number of points

        System.out.println("The total points are " + totalPoints);
        keyboard.close();
    }
    
}
