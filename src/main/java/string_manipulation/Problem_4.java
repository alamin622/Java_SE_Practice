/* 4. Writea program that will give following output:
        Input: chattogram
        Output: C8M   */
package string_manipulation;

public class Problem_4 {
    public static void main(String[] args) {
        String word = "chattogram";

        String letter1 = word.substring(0, 1);
        
        String lastletter = word.substring((word.length() - 1));
        
        String newWord = letter1.toUpperCase() + lastletter.toUpperCase();
        
        String a = String.valueOf(word.length() - newWord.length());
        
        String newWord1 = letter1.toUpperCase() + a + lastletter.toUpperCase();
        
        System.out.println("Output: " + newWord1);

    }
}