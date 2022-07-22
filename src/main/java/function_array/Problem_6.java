/* 6. Suppose a software system excepts valid credentials from user to logged in to the system. if the user inputs wrong password for 3 times,
        system will say that "Your user has been temporary locked". Let the username: admin, password: adm1n */
package function_array;

import java.util.Scanner;

public class Problem_6 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        String username, password, pass = "admin", user_name = "admin";
        int entry = 0;
        do {
            entry++;
            System.out.println("Please enter you user_name.");
            username = enter.nextLine();
            System.out.println("Please enter your password.");
            password = enter.nextLine();

            if (user_name.equals(username) && (pass.equals(password))) {
                System.out.println("Welcome logged in to the system");
            } else if (!(user_name.equals(username)) && ((pass.equals(password)))) {
                System.out.println("Try again!");
            } else {
                System.out.println("Try again!");
            }
            if (entry == 3) {
                System.out.println("Your user has been temporary locked");
                break;
            }
        } while (!(user_name.equals(username)) && !((pass.equals(password))));

    }
}

