/* 8. Write a program to convert each 1st char to uppercase from a string
        Input: rahim lives in sylhet
        Output: Rahim Lives in Sylhet */
package string_manipulation;

public class First_Char_Uppercase_From_String {
    public static void main(String[] args) {
        String str = "rahim lives in sylhet";
        String[] words = str.split(" ");
        for (String word : words) {
            String firstLetter = String.valueOf(word.charAt(0)).toUpperCase();
            String othersLetter = word.substring(1);
            System.out.println(firstLetter + othersLetter);

        }
    }
}