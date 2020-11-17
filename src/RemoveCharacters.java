import java.util.Scanner;

public class RemoveCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().replace("b", "").replace
                ("ac", "");
        System.out.println(str);
    }
}
