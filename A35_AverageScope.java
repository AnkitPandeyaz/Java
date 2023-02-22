//This program demonstrates the if statement and find the average.
import javax.swing.JOptionPane;
public class A35_AverageScope {
    public static void main(String[] args){
        double score1;
        double score2;
        double score3;
        double average;
        String input;

        //get the first test score
        input=JOptionPane.showInputDialog("Enter score #1: ");
        score1=Double.parseDouble(input);

        //get the second test score
        input=JOptionPane.showInputDialog("Enter score #2: ");
        score2=Double.parseDouble(input);

        //get the third score  result
        input=JOptionPane.showInputDialog("Enter score #3: ");
        score3=Double.parseDouble(input);

        //calculate the average score

        average=(score1 + score2+ score3)/3.0;

        //Display the average score
        JOptionPane.showMessageDialog(null, "The average is " +average);
        
        //if the average score was greater than 95, let the user know that is a great score.

        if(average >95)
        {
            JOptionPane.showMessageDialog(null, "That's a great score!");
        }

        System.exit(0);
    }
    
}
