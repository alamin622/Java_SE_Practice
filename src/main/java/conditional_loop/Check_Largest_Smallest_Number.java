/* 10. Write a program to enter the numbers till the user wants and at the end,
the program should display the largest and smallest numbers user entered. */
package conditional_loop;

import java.util.Scanner;

public class Check_Largest_Smallest_Number {
    public static void main(String[] args) {
        int smallest = 0;
        int large = 0;
        int num;
        System.out.println("At Least input two  number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Enter  of " + n + " Number :");
        num = input.nextInt();
        smallest = num; //assume first entered number as small one
        // i starts from 2 because we already took one num value

        for (int i = 1; i < n; i++) {
            num = input.nextInt();
            //comparing each time entered number with large one
            if (num > large) {
                large = num;
            }
            //comparing each time entered number with smallest one
            if (num < smallest) {
                smallest = num;
            }
        }
        System.out.println("the largest is:" + large);
        System.out.println("Smallest no is : " + smallest);
    }
}
