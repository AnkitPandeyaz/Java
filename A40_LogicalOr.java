//This program demonstrate the logical && operator.

import javax.swing.JOptionPane;

public class A40_LogicalOr {
    public static void main(String[] args) {
        double salary; // Annual salary
        double yearsOnJob; // years at current job
        String input; // to hold string input

        // get the user's annual salary
        input = JOptionPane.showInputDialog("Enter your Annual salary ");

        salary = Double.parseDouble(input);

        // get the number of year at the current job.
        input = JOptionPane.showInputDialog("Enter the number of year at your current job.");

        yearsOnJob = Double.parseDouble(input);

        // Determine whether the user qualifies for the lone.

        if (salary >= 30000 || yearsOnJob>=2)
         {
            JOptionPane.showMessageDialog(null, "You qualify for the loan.");
        }
        else{
            JOptionPane.showMessageDialog(null, "You do not qualify for the loan.");
        }
        System.exit(0);
    }

}
