
/**This program ask the user to enter a numeric test score and displays a letter grade for the score.
 * The program uses nested decision structures to determine the grade.*/

import javax.swing.JOptionPane;

public class A38_Nesteddecision {
    public static void main(String[] args) {
        int testScore; // numeric test score
        String input; // to hold the user's input

        // Get the numeric test score.
        input = JOptionPane.showInputDialog("Enter your numeric test score and i will tell you the grade : ");
        testScore = Integer.parseInt(input);

        // Display the grade.

        if (testScore < 60)
        {
            JOptionPane.showMessageDialog(null, "Your grade is F.");
        }
         else if (testScore < 70)
        {
            JOptionPane.showMessageDialog(null, "Your grade is D.");
        } 
        else if (testScore < 80) 
        {
            JOptionPane.showMessageDialog(null, "Your grade is c.");
        } 
        else if (testScore < 90) 
        {
            JOptionPane.showMessageDialog(null, "Your grade is b.");
        } 
        else if (testScore < 100) 
        {
            JOptionPane.showMessageDialog(null, "Your grade is A.");
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Invalid Score.");
        }

    }
}
