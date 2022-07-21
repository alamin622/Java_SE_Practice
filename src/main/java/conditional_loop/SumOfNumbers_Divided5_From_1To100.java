/* 5. Write a program to sum of numbers which only divisible by 5 from 1 to 100 */
package conditional_loop;

public class SumOfNumbers_Divided5_From_1To100 {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Divided by 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + ", ");
                sum += i;

            }
        }
        System.out.println("\n" + "Total Summation " + " = " + sum);
    }
}
