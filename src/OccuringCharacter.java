import java.util.Scanner;

public class OccuringCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] str1 = str.split(" ");
        String newStr = str1[0];
        for (int i = 1; i <str1.length ; i++) {
            newStr+=str1[i];
        }
        char[] chars = newStr.toUpperCase().toCharArray();
        int[] numbers = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            int n = 0;
            for (int j = 0; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    n++;
                }
            }
            numbers[i] = n;
            n = 0;
        }
        int maximum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }
        boolean isMaxFond = true;
        for (int i = 0; isMaxFond; i++) {
            if (numbers[i] == maximum) {
                isMaxFond = false;
                System.out.println(chars[i] + " = " + numbers[i]);
            }
        }
    }
}

