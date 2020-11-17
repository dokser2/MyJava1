public class AverageValue {
    public static void main(String[] args) {
        int[] elements={20,7,-9,0,13};
         double result=0;
        for (int i = 0; i < elements.length; i++) {
            result += elements[i];
        }
        System.out.println(result/elements.length);
    }
}
