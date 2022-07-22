/* 6. Replace "R" from Rahim with "F" from the given String:
        Input: Ratul and Rahim lives in Rangpur
        Output: Ratul and Fahim lives in Rangpur */
package string_manipulation;

public class String_Replace {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder(" Ratul and Rahim lives in Rangpur");
        System.out.println("Input = " + str);
        // Replacing substring from index 11 to index 12
       str.replace(11, 12, "F");
        System.out.println("Output= " + str);
    }
}