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
        HashMap itemList=items();
        String itemName="Item 2";
        String price=searchItem(itemName);
        if (price.contains("Item not found")) {
            System.out.println(price);
        }
        else{
            System.out.println("Price of "+ itemName+" is "+price +" tk");
        }

        int totalPrice=totalSum(itemList);
        System.out.println("Total item price is "+ totalPrice+" Tk");
    }
    public static HashMap items(){
        HashMap<String,Integer>hashMap=new HashMap<>();
        hashMap.put("Item 1", 100);
        hashMap.put("Item 2", 120);
        hashMap.put("Item 3", 800);
        hashMap.put("Item 4", 160);
        hashMap.put("Item 5", 20);
        return hashMap;
    }
    public static String searchItem(String item){
        HashMap itemList=items();
        if(itemList.get(item)==null){
            return "Item not found";
        }
        else{
            return itemList.get(item).toString();
        }

    }
    public static int totalSum(HashMap<String, Integer> hashMap){
        Integer[] price=hashMap.values().toArray(new Integer[0]);
        int sum=0;
        for(int i=0;i<price.length;i++){
            sum+=price[i];
        }
        return sum;
    }

}
