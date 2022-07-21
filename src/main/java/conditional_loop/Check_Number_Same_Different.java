/* 3.  Input 2 decimal numbers and check if they are both same or different up to two decimal places.*/
package conditional_loop;

import java.util.Scanner;

public class Check_Number_Same_Different {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input First number : ");
        double num1 = input.nextDouble();

        System.out.println("Input Second number : ");
        double num2 = input.nextDouble();

        if ((Math.abs(num1 - num2)) == 0.00) {
            System.out.println("There number are the same");
        } else {
            System.out.println("These number are different");
        }
    }
}
