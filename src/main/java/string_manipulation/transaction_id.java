/* 1. Extract the transaction ID from the HTML body
<html>
<title>Test</title>
<body>
Your trnx is successful. Trnx Id is: TXN123456
</body>
</html>
        Output: TXN123456 */

package string_manipulation;
public class transaction_id {
    public static void main(String[] args) {
        String html = "<html>" +
                "<title>Test</title>" +
                "<body>" +
                "Your trnx is successful. Trnx Id is: TXN123456" +
                "</body>" +
                "</html>";
        html = html.replace("<", " ") ;
        html = html.replace(">", " ") ;
        html = html.replace("/", " ") ;
        html = html.trim();
        String[] words = html.split(" ");
        for (int i = 0; i< words.length; i++){
        }
       String txn = html.substring(html.indexOf("TXN"),76);
        System.out.println("transaction ID : " + txn);



    }
}
