package static2;
import static static2.DecoData.*;

public class DecoDataMain {
    public static void main(String[] args) {
        //메인메서드를 뜯어보면 정적이다.
        //여기서 바로 호출하려면 static메서드로 만들어줘야함.

        System.out.println("1. 정적호출");
        staicCall();

        System.out.println("2. 인스턴스 호출");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출 2번째 ");
        DecoData data2 = new DecoData();
        data2.instanceCall(); //인스턴스는 영원히 1, static은 +1+1+1.. 3
    }
}
