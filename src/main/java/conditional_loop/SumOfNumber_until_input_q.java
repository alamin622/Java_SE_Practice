/* 9. Write a program to sum of user input until users input ‘q’ from keyboard */
package conditional_loop;

import java.util.Scanner;

public class SumOfNumber_until_input_q {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        char charInput;
        int input;
        while (true) {
            try {
                System.out.println("Input a number for summation (press q for quit)");
                input = scanner.nextInt();
                sum += input;
                System.out.println(sum);
            } catch (Exception e) {
                charInput = scanner.next().charAt(0);
                if (charInput == 'q' || charInput == 'Q') {
                    break;
                }

            }
        }

    }
}

