import java.util.Scanner;
import java.io.*;

public class A64_FileWriteDemo {
    public static void main(String[] args) {
        String filename;
        String friendName;
        int numFriends;

        // Create a scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Get the number of friends
        System.out.print("How many friends do you have? ");
        numFriends = keyboard.nextInt();

        // Consume the remaining newline character
        keyboard.nextLine();

        // Get the filename
        System.out.print("Enter the filename: ");
        filename = keyboard.nextLine();

        // Open the file
        try (PrintWriter outputFile = new PrintWriter(filename)) {
            // Get the data and write it to the file
            for (int i = 1; i <= numFriends; i++) {
                // Get the name of a friend
                System.out.print("Enter the name of friend " + i + ": ");
                friendName = keyboard.nextLine();

                // Write the name to the file
                outputFile.println(friendName);
            }
            System.out.println("Data written to the file.");
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
            keyboard.close();
        }
    }
}
