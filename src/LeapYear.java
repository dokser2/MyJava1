public class LeapYear {
    public static void main(String[] args) {
        int[] years = {2021, 2400, 120, 48, 75};
        for (int i = 0; i < years.length; i++) {
            if (( years[i]%100!=0)&&years[i] % 4 == 0){
                System.out.println(years[i] + " is a leap year");
            }
        }
    }
}
