//This program calculates a running total.

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class A61_TotalSales {
    public static void main(String [] args){
        int days;  //The number of days
        double sales; // A day's sales figure
        double totalSales; // Accmulator
        String input; //To hold the user inputs


        //Create a DecimalFormat object to formate output.
        DecimalFormat dollar = new DecimalFormat("# , ##0.00");

        //Get the number of days

        input =JOptionPane.showInputDialog(" For how many days do you have sales figures?");

        days = Integer.parseInt(input);

        //set the accumulator to 0

        totalSales = 0.0;

        //Get the sales figures and calculate a running total

        for(int count = 1; count<=days; count ++){
            input = JOptionPane.showInputDialog("Enter the sales for day " + count + " :");

            sales = Double.parseDouble(input);
            totalSales +=sales; //Add sales to totalsales.
        }

        //Display the total sales

        JOptionPane.showMessageDialog(null, "The total sales are $" + dollar.format(totalSales));

        System.exit(0);

    }
    
}
