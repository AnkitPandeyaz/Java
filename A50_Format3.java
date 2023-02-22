//This program demonstrates the DecimalFormat class.

import java.text.DecimalFormat;

public class A50_Format3 {
    public static void main(String[] args) {
        double number1 =123.899;
        double number2 = 1233.899;
        double number3 =12345.899;
        double number4 = 123456.899;
        // create a DecimalFormat object.

        DecimalFormat formatter = new DecimalFormat("#,##0.00");

        // Display the formatted variable contents.

        System.out.println(formatter.format(number1));
        System.out.println(formatter.format(number2));
        System.out.println(formatter.format(number3));
        System.out.println(formatter.format(number4));

    }

}
