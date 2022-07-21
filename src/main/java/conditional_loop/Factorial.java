/* 6. Write  a program to find the factorial of a given number */
package conditional_loop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, fact = 1;
        System.out.println("Input Number: ");
        int number = input.nextInt();//It is the number to calculate factorial
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " = " + fact);
    }
}
