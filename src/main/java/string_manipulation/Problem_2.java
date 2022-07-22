/* 2. Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee,
        then 400 tk will be discounted. After your purchase what will be your total cost? */
package string_manipulation;

import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int SHIRT_COUNT = 1200;

        int Sharee = 3500;

        // Get number of shirts purchased.
        System.out.println("Enter the number of shirts ");

        int shirts = input.nextInt();
        // Get number of Sharee purchased.
        System.out.println("Enter the number of Sharee ");
        int discount;
        int Sharees = input.nextInt();
        if (Sharees == 1 && shirts == 2) {
            discount = 400;
        } else {
            discount = 0;
        }

        int finalDiscount = (((SHIRT_COUNT * shirts) + (Sharee * Sharees)) - discount);
        System.out.println("\t" + SHIRT_COUNT + "\t x \t" + shirts );
        System.out.println("\t" + Sharee + "\t x \t" + Sharees);
        System.out.println("-------------------------");
        System.out.println(" Discount  " + "\t" + "="+ "\t"  +discount);
        System.out.println(" purchase price " + "\t" + "="  + "\t" + finalDiscount);

    }
}
