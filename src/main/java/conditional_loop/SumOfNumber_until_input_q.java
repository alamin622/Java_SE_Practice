/* 9. Write a program to sum of user input until users input ‘q’ from keyboard */
package conditional_loop;

import java.util.Scanner;

public class SumOfNumber_until_input_q {
    public static void main(String[] args) {
        int sum = 0;
        char ch;
        System.out.println("Input a number");
        Scanner input = new Scanner(System.in);
        do {
            sum += input.nextInt();
            System.out.println("Total Summation " + " = " + sum);
            System.out.println("Do you want to continue?");
            ch = input.next().charAt(0);
        }
        while (ch != 'q');

    }

}

