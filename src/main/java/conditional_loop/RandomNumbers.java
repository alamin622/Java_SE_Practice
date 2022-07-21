/*8. Write a program to generate 2 random numbers which will not be shown to the  user.
Take a user input and match it with any of the random numbers. If correct give it 1 point and if incorrect,
do not give it any point. Finally, repeat this for 10 times and count the point user achieved.*/

package conditional_loop;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);
        Scanner input = new Scanner(System.in);
        int guess = -1;
        while (guess != number) {
            System.out.print("Enter your random number: ");
            guess = input.nextInt();
            if (guess == number)
                System.out.println("Yes, the number is " + number + " You have received 1 point");
            else if (guess > number)
                System.out.println("Your guess is too high");
            else
                System.out.println("Your guess is too low");
        } // End of loop

    }
}
