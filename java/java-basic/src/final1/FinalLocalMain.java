package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        //final지역변수
        final int data1;
        data1 = 10; //최초 한번만 할당
        //data2 = 20; <-이게안됨

        final int data2 = 10;
        //data2 = 20; 물론안됨
        method(10);


    }
    static void method(final int a){
        //a = 20; 이럼 안됨..
    }
}
