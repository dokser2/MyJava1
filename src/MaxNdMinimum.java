public class MaxNdMinimum {
    public static void main(String[] args) {
        double[] elements = {5.3, 6.7, 8.0, -15.5, -2.0, 0.0, 1, 4};
        double maximum = elements[0];
        for (int i = 1; i < elements.length; i++) {
            if (elements[i] > maximum) {
                maximum = elements[i];
            }
        }
        double minimum = elements[0];
        for (int i = 1; i < elements.length; i++) {
            if (elements[i] < minimum) {
                minimum = elements[i];
            }
        }
        System.out.println(maximum);
        System.out.println(minimum);
    }
}
