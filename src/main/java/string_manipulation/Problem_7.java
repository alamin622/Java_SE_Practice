/* 7. Find out how many images are in the given array:
        ["photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"]
        Output: 3 */
package string_manipulation;

public class Problem_7 {
    public static void main(String[] args) {
        String[] str = {"photo1.jpg",  "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"};
        String[] img = {"photo1.jpg", "photo2.png", "photo3.jpg"};

        System.out.println(
                "Total no of image are: " + img.length);

    }

}



