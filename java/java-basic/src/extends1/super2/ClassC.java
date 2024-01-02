package extends1.super2;

public class ClassC extends ClassB{
    public ClassC(){
        //b는 생성자를 정의해버렸기때문에,
        super(10,20); //무조건 직접 해줘야한다.
        System.out.println("classc 생성자");

    }
}
