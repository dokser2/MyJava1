import java.util.ArrayList;
public class SecondSmallest {
    public static void main(String[] args) {
        double[] theElements = {5.3, 6.7, -8.0, -15.5, -4.0, 0.0, 1, 4};
        double minimum = theElements[0];
        for (int i = 1; i < theElements.length; i++) {
            if (theElements[i] < minimum) {
                minimum = theElements[i];
            }
        }
        double sMin = Double.MAX_VALUE;
        for (int i = 0; i < theElements.length; i++) {
            if (theElements[i] < sMin) {
                if (theElements[i] != minimum) {
                    sMin = theElements[i];
                }
            }
        }
        System.out.println(sMin);
    }
}
//        ArrayList<Double> arrSecMin = new ArrayList<>();
//        for (int j = 0; j < theElements.length; j++) {
//            if (theElements[j] > minimum) {
//                arrSecMin.add(theElements[j]);
//            }
//        }
//        double secndMinimum = arrSecMin.get(0);
//        for (int i = 1; i < arrSecMin.size(); i++) {
//            if (secndMinimum > arrSecMin.get(i)) {
//                secndMinimum = arrSecMin.get(i);
//            }
//        }
//        System.out.println(secndMinimum);

