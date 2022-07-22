/* 3. Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?  */
package string_manipulation;

public class Problem_3 {
    public static void main(String[] args) {
        double dis, amount, markedprice, s;

        markedprice = 76000;

        dis = 10;  // 10 mean 10%

        System.out.println("markedprice= " + markedprice);

        System.out.println("discount rate=" + dis);

        s = 100 - dis;

        amount = (s * markedprice) / 100;

        System.out.println("amount after discount=" + amount);
    }
}
