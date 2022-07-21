/* 2. Write a program to calculate GPA and find grade*/
package conditional_loop;

import java.util.Scanner;

public class Gpa_Grade {
    public static void main(String[] args) {
        int subcount, i;
        float totalMarks = 0, average;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number of Subject");
        subcount = scanner.nextInt();

        System.out.println("Enter Marks of " + subcount + " Subject");
        for (i = 0; i < subcount; i++) {
            totalMarks += scanner.nextInt();
        }
        System.out.println("Total MArks : " + totalMarks);
        // Each subject is of 100 Marks
        average = (totalMarks / (subcount * 100)) * 100;

        /* Printing grade  */
        switch ((int) average / 10) {
            case 8:
                System.out.println("Grade : A+");
                break;
            case 7:
                System.out.println("Grade : A");
                break;
            case 6:
                System.out.println("Grade : B");
                break;
            case 5:
                System.out.println("Grade : C");
                break;
            default:
                System.out.println("Grade : D");
                break;
        }
    }
}
