/* 7. Write a program to print prime numbers from 2 to n */
package conditional_loop;

import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        System.out.println("Enter maximum number: ");
        Scanner input = new Scanner(System.in);
        int maxNumber = input.nextInt();
        System.out.println("List of the prime number between 1 - " + maxNumber);
        for (int num = 2; num <= maxNumber; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true)
                System.out.print(num + ", ");
        }
    }
}
