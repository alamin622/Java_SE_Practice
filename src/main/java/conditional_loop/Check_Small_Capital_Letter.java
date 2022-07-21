/* 1. Write a program to check if inputted letter is small or capital*/
package conditional_loop;

import java.util.Scanner;

public class Check_Small_Capital_Letter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the character : ");
        char ch = input.next().charAt(0);    // Store the input from the user
        if (ch >= 'A' && ch <= 'Z') {   // If it is true, Display Uppercase
            System.out.println(ch + " is an Uppercase letter");
        } else if (ch >= 'a' && ch <= 'z') {   // If it is true, Display lowercase
            System.out.println(ch + " is a Lowercase letter");
        } else {
            System.out.println(" is not a alphabets");
        }

    }
}
