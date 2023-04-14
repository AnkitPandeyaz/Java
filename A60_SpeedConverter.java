//This program dispalys a table of speeds in kph converted to mph.

public class A60_SpeedConverter {
    public static void main (String [] args){
        //constants

        final int Starting_KPH = 60;    //Staring speed
        final int MAX_KPH = 130; // maximum speed
        final int Increment = 10; // speed increase


        //variables

        int kph;  //to hold the speed in  kph
        double mph;  //to hold the speed in mph

        //Display the table heading

        System.out.println("KPH \t\tMPH");
        System.out.println();

        for(kph=Starting_KPH; kph<= MAX_KPH; kph+=Increment){

            mph = kph*0.6214;

            //Display the speed in kph and mph

            System.out.printf("%d\t\t%.1f\n", kph, mph);

        }
    }
    
}
