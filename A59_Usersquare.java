//This program demonstrate the square of number taken by user.

import java.util.Scanner;

public class A59_Usersquare {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int maxValue = sc.nextInt();

        for (number = 1; number <= maxValue; number++) {
            System.out.println("The square of " + number + " is " + number * number);
        }

        sc.close();
    }

}
