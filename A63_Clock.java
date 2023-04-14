//This program uses nested loops to simulate a clock

import java.text.DecimalFormat;
public class A63_Clock {
    public static void main(String[] args) {
        
        //Create a Decimalformat object to format output

        DecimalFormat time = new DecimalFormat("00");

        //Simulate the clock

        for(int hour = 1; hour<=12; hour++){
            for(int minutes = 0; minutes<=59; minutes++){
                for(int second = 0; second<=59;second++){
                    System.out.println(time.format(hour) + " :");
                    System.out.println(time.format(minutes) + " :");
                    System.out.println(time.format(second));
                }   
            }
        }
    }
    
}
