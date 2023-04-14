//this program read the data from the file

import java.util.*;
import java.io.*;
public class A66_fileRead {
    public static void main(String[] args) {
        
        //create a scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        //Get the file name
        System.out.print("Enter the file name: ");
        String filename= keyboard.nextLine();

        //open the file
        File file = new File(filename);
       try(Scanner inputFile = new Scanner(file)){


        //Read lines from the file until no more are left

        while(inputFile.hasNext())
        {

            //read the next name
            String friendName = inputFile.nextLine();

            //display the last name read

            System.out.println(friendName);

        }

        //close the file

        inputFile.close();

       }catch (Exception e) {
        System.out.println("Error writing to the file: " + e.getMessage());
        keyboard.close();
       }

        

    }
    
}
