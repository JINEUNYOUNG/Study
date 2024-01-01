package static2;

public class MathArrayUtilsMain {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        //객체 생성 안하고 바로 불렀음 -> static이다.
        System.out.println("sum=" + MathArrayUtils.sum(values));
        System.out.println("average=" + MathArrayUtils.average(values));
        System.out.println("min=" + MathArrayUtils.min(values));
        System.out.println("max=" + MathArrayUtils.max(values));
    }
}
