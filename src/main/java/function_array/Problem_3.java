/* 3. Suppose, in a company , here are some employee salaries in an array
        [35000, 25000, 28000, 32500, 44000, 32800]
        Find out the 3rd highest salary */
package function_array;

import java.util.Arrays;

public class Problem_3 {
    public static void main(String[] args) {
        int[] a = {35000, 25000, 28000, 32500, 44000, 32800};
        System.out.println("3rd highest salary: " + getThirdLargest(a, 6));
    }

    public static int getThirdLargest(int[] a, int total) {
        Arrays.sort(a);
        return a[total - 3];
    }
}
