//This program demonstrates using dialogs with  JOptionPane.

import javax.swing.JOptionPane;

public class A33_NameDialog {
    public static void main(String[] args) {
        String firstName;
        String middleName;
        String lastName;

        // to get the user first name

        firstName = JOptionPane.showInputDialog("What is your first name?");

        // to get the user middle name
        middleName = JOptionPane.showInputDialog("What is your middle name?");

        // to get the last name;

        lastName = JOptionPane.showInputDialog("What is your Last name?");

        // Display a greeting

        JOptionPane.showMessageDialog(null, "Hello " + firstName + " " + middleName
                + " " + lastName);
        System.exit(0);
    }

}
