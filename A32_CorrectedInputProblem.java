// This program correctly read numeric and string input.

import java.util.Scanner;
public class A32_CorrectedInputProblem {
    public static void main(String[] args){

        String name;
        int age;
        double income;

        //create a scanner object to read input.
        Scanner read = new Scanner(System.in);

        
        
        //to get user age
        
        System.out.print("What is your age? ");
        age=read.nextInt();
        
        //to get user income
        
        System.out.print("What is syour annual income? ");
        income=read.nextDouble();

        //consume the remaining new line

        read.nextLine();
        
        //to get user name

        System.out.print("What is your name? ");
        name=read.nextLine();

        //Display the information back to the user

        System.out.println("Hello " + name + ". Your age is " + age + " and your income is $" 
        +income);

        read.close();


    }

    
}
