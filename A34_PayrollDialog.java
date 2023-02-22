//This program demonstrates using dialogs with JOptionPane

import javax.swing.JOptionPane;

public class A34_PayrollDialog {
    public static void main(String[] args){
        String inputString;
        String name;
        int hours;
        double payRate;
        double grossPay;

        //get the user name
        name=JOptionPane.showInputDialog("What is your name? ");

        //get the hours worked

        inputString=JOptionPane.showInputDialog("How many hours did you work this weeks?");

        //convert the input to an int.

        hours = Integer.parseInt(inputString);

        //Get the hourly pay rate

        inputString=JOptionPane.showInputDialog("What is your hourly pay rant?");

        //conver the input to a double

        payRate= Double.parseDouble(inputString);

        //calculate the gross pay

        grossPay= hours * payRate;


        //Display the results

        JOptionPane.showMessageDialog(null, "Hello " + name+ ". Your  gross Pay is $" + grossPay);

        //End the progress

        System.exit(0);

    }
    
}
