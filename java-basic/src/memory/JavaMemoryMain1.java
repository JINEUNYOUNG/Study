package memory;

public class JavaMemoryMain1 {
    public static void main(String[] args) { //main스택프레임은 내부에 args라는 매개변수를 가진다.
        System.out.println("main start"); //1
        method1(10);
        System.out.println("main end");//6
    }
    static void method1(int m1) {
        System.out.println("method1 start"); //2
        int cal = m1 * 2;
        method2(cal);
        System.out.println("method1 end"); //5
    }
    static void method2(int m2) {
        System.out.println("method2 start"); //3
        System.out.println("method2 end"); //4
    }
}
