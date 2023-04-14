//This program reads the first line from a file

import java.util.*;
import java.io.*;
public class A65_ReadFirstLine {
    public static void main(String[] args) {
        
        //Create a Scanner object for kayboard input

        Scanner keyboard = new Scanner(System.in);

        //Get the file name
        System.out.print("Enter the name of the file: ");
        String filename = keyboard.nextLine();

        //open the file
        
        File file = new File (filename);
        try(Scanner inputFile = new Scanner(file)){

        //read the first line from the file

        String line = inputFile.nextLine();

        //Display the line 

        System.out.println("The first line in the file is : ");
        System.out.println(line);

        String line2 = inputFile.nextLine();
        //Display the line 
        System.out.println("The second line in the file is : ");
        System.out.println(line2);

        //close the file
        inputFile.close();
    } catch (IOException e) {
        System.out.println("Error writing to the file: " + e.getMessage());
        keyboard.close();
    }

    }
    
}
