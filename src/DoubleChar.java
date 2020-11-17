import java.util.Scanner;

public class DoubleChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        char[] twoChars = new char[2 * chars.length];
        int j = 0;
        for (int i = 0; i < chars.length; i++) {
            twoChars[j] = chars[i];
            j++;
            twoChars[j] = chars[i];
            j++;
        }
        String s = "";
        for (int i = 0; i < twoChars.length; i++) {
            System.out.print(twoChars[i]);
        }
    }
}
