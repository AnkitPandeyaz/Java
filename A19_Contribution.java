//This program calculates the amount of pay that will be contributed to a retirement plan if 5%, 7%, or 10% of monthly pay is withheld.

public class A19_Contribution {
    public static void main(String[] args){
        // variable to hold the monthly  pay and the amount of contribution.
        double monthlyPay=6000.0;
        double contribution;

        // calculate and display a 5% contribution

        contribution=monthlyPay*0.05;
        System.out.println("5 percent is $ " +contribution+ " per month.");

        //calculate and display a 8% contribution

        contribution=monthlyPay*0.08;
        System.out.println("8 percent is $ " + contribution + "per month.");

        //calculate and display a 10% contribution

        contribution= monthlyPay*0.10;
        System.out.println("10 percent is $ " + contribution+ " per month.");
    }
    
}
