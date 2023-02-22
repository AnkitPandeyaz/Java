//This program demonstrates the DecimalFormat class.

import java.text.DecimalFormat;

public class A48_Format1 {
    public static void main(String[] args) {
        double number1 = 0.1666666666667;
        double number2 = 1.6666666666667;
        double number3 = 16.666666666667;
        double number4 = 166.66666666667;

        // create a DecimalFormat object.

        DecimalFormat formatter = new DecimalFormat("#0.00");

        // Display the formatted variable contents.

        System.out.println(formatter.format(number1));
        System.out.println(formatter.format(number2));
        System.out.println(formatter.format(number3));
        System.out.println(formatter.format(number4));

    }

}
