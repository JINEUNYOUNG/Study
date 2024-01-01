package static2;

public class MathArrayUtils {
    public static int sum(int[] values) {
        int sum = 0 ;
        for (int x : values){
            sum+=x;
        }
        return sum;
    }
    public static double average(int[] values) {
        double ave = (double)sum(values) / values.length;
        return ave; //여기서 sum 다시 불러서..
    }
    public static int min(int[] values) {
        int min = values[0] ;
        for (int x : values){
            if(x < min){
                min = x;
            }
        }
        return min;
    }
    public static int max(int[] values) {
        int max = values[0] ;
        for (int x : values){
            if(x > max){
                max = x;
            }
        }
        return max;
    }
}
