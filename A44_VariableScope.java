//This program demonstrate how variables may be declared in various locations throughout a program

import javax.swing.JOptionPane;
public class A44_VariableScope {
    public static void main(String [] args){
    
        //get the user first name.

        String firstName;
        firstName= JOptionPane.showInputDialog("Enter your first name.");

        //get the user last name
        String lastName;
        lastName=JOptionPane.showInputDialog("Enter the last name.");

        //show the output 

        JOptionPane.showMessageDialog(null, " Hello " + firstName + " " + lastName);
        System.exit(0);
    }
    
}
