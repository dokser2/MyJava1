import java.util.Scanner;

public class TheSameAmountOfTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strings = str.split(" ");
        int r = 0;
        int b = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals("red")) {
                r++;
            } else if (strings[i].equals("blue")) {
                b++;
            }
        }
        if (b == r) {
            System.out.println("Same amount of red and blue");
        } else {
            System.out.println("NOT the same amount");
        }
    }
}
