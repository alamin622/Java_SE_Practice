/* 5. Take 5 numbers from users in an array. Then find out the average number,
how many even and how many odd numbers using these functions: average(), countEvenNumbers(), countOddNumbers() */
package function_array;

public class Problem_5 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 9, 14, 17};
        int n = arr.length;
        average(arr, n);
        countEvenNumbers(arr, n);
        countOddNumbers(arr, n);

    }

    public static void average(int[] arr, int arr_size) {
        double total = 0;
        for (int i = 0; i < arr_size; i++) {
            total = total + arr[i];
        }
        double average = total / arr.length;
        System.out.println("Number of Average" + " elements = " + average);
    }

    public static void countEvenNumbers(int[] arr, int arr_size) {
        int even_count = 0;
        for (int i = 0; i < arr_size; i++) {
            if (arr[i] % 2 == 0)
                even_count++;
        }
        System.out.println("Number of even" + " elements = " + even_count);
    }

    public static void countOddNumbers(int[] arr, int arr_size) {
        int odd_count = 0;
        for (int i = 0; i < arr_size; i++) {
            if (arr[i] % 2 == 1)
                odd_count++;
        }
        System.out.println("Number of Odd" + " elements = " + odd_count);
    }


}

