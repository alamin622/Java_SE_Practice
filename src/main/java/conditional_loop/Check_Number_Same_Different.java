/* 3.  Input 2 decimal numbers and check if they are both same or different up to two decimal places.*/
package conditional_loop;

import java.util.Scanner;

public class Check_Number_Same_Different {
    public static void main(String[] args) {
            double number1=120.569;
            double number2=120.57;
            if(Math.round(number1)==Math.round(number2)){
                System.out.println("Matches");
            }
            else{
                System.out.println("Didn't match");
            }
    }
}
