//this program read a series of numbers from a file and accumulate their sum
import java.util.*;
import java.io.*;

public class A67_FileSum {
    public static void main(String[] args) {
        
        double sum = 0.0;

        //open the file for reading
        File file = new File("friend.txt");
        try(Scanner inputFile = new Scanner(file)){

            //read all of the value s from the file and calculate their total

            while(inputFile.hasNext())
            {

                //read the value from the file

                double friend = inputFile.nextDouble();

                // add the number to sum

                sum = sum + friend;
            }

            //close the file
            inputFile.close();

            //display the sum of the number 
            System.out.println("The sum of the number in friend.txt is " + sum);
            
        } catch (Exception e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }
    
}
