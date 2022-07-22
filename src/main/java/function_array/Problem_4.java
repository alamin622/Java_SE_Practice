/*
4. Create your todays bazar list/pocket expenditure which includes the item name and price. Then create a function named
 searchItem(String item) which will be used to search any item from your   HashMap and return the price.  If found no item,
  then print message as "No item found" and another function named totalSum()which will return total price of items.
*/

package function_array;

import java.util.HashMap;
import java.util.Scanner;
import java.lang.*;

public class Problem_4 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        Integer value;
        // Add keys and values (Item, Price)
        hashMap.put("Banana", 100);
        hashMap.put("Apple", 200);
        hashMap.put("Orange", 170);
        hashMap.put("litchi", 400);
        System.out.println(hashMap);
        int TotalSUm= getTotal(hashMap);
        System.out.println("----------------------------");
        System.out.println("TOTAL\t"  + " =  " + TotalSUm);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer :");
        String x = scan.next();

        value = hashMap.get((x));
        System.out.println("Value is:" + value);
        if (value == null){
            System.out.println("No found item ");
        }
    }

    public static int getTotal(HashMap<String, Integer> p) {
        int total = 0;

        for (int value : p.values()) {
            System.out.println("\t" + value + "\t\t  " );
            total += value;
        }
        return total;
    }

}
