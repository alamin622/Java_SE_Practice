/* 2. Input an amount from the user and find out the number of notes from input amount in given array
        [1000,500,100,50,20,10,5,2,1]
        Input: 1256
        Output:
        1000 1
        100 2
        50 1
        2 3 */
package function_array;

import java.util.Scanner;

public class Problem_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] Arr = {1000, 500, 100, 50, 20, 10, 5, 2, 1};
        System.out.print("Enter any Amount : ");
        int amount = Integer.parseInt(input.next());

        int copy = amount;
        int totalNotes = 0, count;
        System.out.println("\n Output : \n");
        for (int i = 0; i < 9; i++) {
            // count number of notes.
            count = amount / Arr[i];
            if (count != 0) {
                System.out.println("\t" + Arr[i] + "\t x \t" + count + "\t= " + Arr[i] * count);
            }
            totalNotes = totalNotes + count;
            amount = amount % Arr[i];
        }
        System.out.println("----------------------------");
        System.out.println("TOTAL\t\t" + totalNotes + "\t" + " =  " + copy);

    }
}
