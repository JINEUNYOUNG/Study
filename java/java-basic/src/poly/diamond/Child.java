package poly.diamond;

public class Child implements InterfaceA, InterfaceB{

    @Override
    public void methodA() {
        System.out.println("child methoda");

    }

    @Override
    public void methodB() {
        System.out.println("child methodb");

    }

    @Override
    public void methodCommon() {
        //a에도 b에도 있지만 어차피 구현은 여기에서 하는거라, 다중구현 문제 없음
        System.out.println("child");
    }
}
