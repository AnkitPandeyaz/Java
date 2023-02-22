//This program demonstrates the DecimalFormat class.

import java.text.DecimalFormat;
public class A51_Format4 {
    public static void main(String [] args){

        double number1 = 0.12;
        double number2= 0.05;

        // create a DecimalFormat object.

        DecimalFormat formatter = new DecimalFormat("#0%");

        // Display the formatted variable contents.

        System.out.println(formatter.format(number1));
        System.out.println(formatter.format(number2));
    }
    
}
