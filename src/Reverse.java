import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String nstr = Integer.toString(n);
        char[] ch = nstr.toCharArray();
        for (int i = ch.length-1; i >=0;i--) {
            System.out.print(ch[i]);
        }
    }
}
