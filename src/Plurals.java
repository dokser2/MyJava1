import java.util.ArrayList;
import java.util.Scanner;

public class Plurals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        ArrayList<Integer> numbers = new ArrayList<>();
        do {
            str = sc.nextLine();
            if (!str.equals("end")) {
                numbers.add(Integer.parseInt(str));
            }
        } while (!str.equals("end"));
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        for (int j = 0; j < numbers.size(); j++) {
            if (numbers.get(j) > 0) {
                positive++;
            } else if (numbers.get(j) < 0) {
                negative++;
            } else if (numbers.get(j) == 0) {
                zeros++;
            }
        }
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zeros: " + zeros);
    }
}
