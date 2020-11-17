import java.util.Scanner;

public class JustScannerr {
    public static void main(String[] args) {
        String str = "mama#and papa love the dog";
        Scanner sc = new Scanner(System.in);
        String myStr = sc.nextLine();
        String[] strings = str.split("#");
        int n = 0;
        for (int i = 0; i < strings.length; i++) {
            if (myStr.equals(strings[i])) {
                n++;
            }
        }
        if (n == 0) {
            System.out.println(myStr + " is NOT the string in template");
        } else {
            System.out.println(myStr + " is the string in template");
        }
    }
}
