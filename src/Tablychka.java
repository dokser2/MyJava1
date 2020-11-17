import java.util.Scanner;
public class Tablychka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]numbers = new int[10];
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]=i+1;
        }
        for (int i = 0; i <numbers.length ; i++) {
            System.out.println(n+" * " + numbers[i] + " = " +
                    n*numbers[i]);
        }
    }
}
