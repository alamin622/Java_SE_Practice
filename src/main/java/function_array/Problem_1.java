/* 1. Take input from a user and check if the number exists in the array
        let the array is [1,3,5,7,2,4,6,8]
        Input: 7
        Output: Found in the position 3
        Input: 9
        Output: Found no element */
package function_array;


import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {

        int count;
        int num;
        int search;
        int[] array;


        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        num = in.nextInt();
        array = new int[num];

        System.out.println("Enter those " + num + " elements");

        for (count = 0; count < num; count++)
            array[count] = in.nextInt();

        System.out.println("Enter value to find : ");
        search = in.nextInt();

        for (count = 0; count < num; count++) {
            if (array[count] == search) {
                System.out.println(search + " Found in the position :  " + count + ".");
                break;
            }
        }
        if (count == num)
            System.out.println(search + " Found no element.");
    }
}

