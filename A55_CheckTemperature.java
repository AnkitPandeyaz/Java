//This programassists a technician in the process of checking a substance's temperature.

import java.util.Scanner;
public class A55_CheckTemperature {
    public static void main(String [] args){
            final double MAX_Temp = 102.5;
            double temperature;

            //create a scanner object for keyboard input.
            Scanner keyboard = new Scanner(System.in);
            
            //get the current temperature
            System.out.print("Enter the substance's Celsius temperature: ");
            temperature=keyboard.nextDouble();

            //as long as necessary, instruct the technician to adjust the temperature

            while(temperature > MAX_Temp)
            {
                System.out.println("The temperature is too high.\nTurn the thermostat down and wait for 5 minutes.\n Then, take the Celsius temperature again");
                System.out.print("and enter it here : ");
                temperature = keyboard.nextDouble();
            }

            //remind the technician to check the temperature again in 15 minutes.

            System.out.println("The temperature is acceptable.");
            System.out.println("Check it again in 15 minutes.");

            keyboard.close();
    }
    
}
