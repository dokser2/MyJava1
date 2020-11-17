import java.util.ArrayList;
import java.util.Scanner;

public class WordsReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nstr = sc.nextLine();
        ArrayList<String> theWords = new ArrayList<>();
        for (String str : nstr.split(" ")) {
            theWords.add(str);
        }
        for (int i = theWords.size() - 1; i >= 0; i--) {
            System.out.print(theWords.get(i));
            System.out.print(" ");
        }
    }
}
