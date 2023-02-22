//this program show the program has a problem reading input

import java.util.Scanner;
public class A31_InputProblem {
    public static void main(String[] args){
        String name; // to hold the user's name 
        int age; //to hold the user's age 
        double income;  //to hold the user income

        //create a Scanner object to read input
        Scanner problem = new Scanner(System.in);

        
        
        //to get the user age
        
        System.out.print("Enter the age: ");
        age=problem.nextInt();
        
        
        //to get the user income
        
        System.out.print("What is your Annual Income?  ");
        income=problem.nextDouble();
        
        
        //to get the user name

        System.out.print("Enter the name: ");
        name= problem.nextLine();


        // to display the information back to user.

        System.out.println("Hello " + name + ". Your age is " + age + " and your annual income is $"
         + income);
         problem.close();

    }
    
}
