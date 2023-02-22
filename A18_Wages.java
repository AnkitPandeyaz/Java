//This program calculates hourly wages plus overtime.

public class A18_Wages {
    public static void main(String[] args){
        double regularWages;
        double basicPay=25;
        double regularHours=40;
        double overtimeWages;
        double overtimePay=37.5;
        double overtimeHours=10;
        double totalWages;

        regularWages=basicPay*regularHours;
        overtimeWages=overtimePay*overtimeHours;

        totalWages=regularWages+overtimeWages;

        System.out.println("Wages for this week are $" + totalWages);

        
    }
    
}
