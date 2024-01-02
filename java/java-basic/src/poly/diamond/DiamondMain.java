package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {

        InterfaceA a = new Child();
        a.methodCommon();
        a.methodA();
        InterfaceB b = new Child();
        b.methodCommon();
        b.methodB();
        Child c = new Child();
        c.methodA();
        c.methodB();
        c.methodCommon();
        //어차피 모두 child에서 구현했음

    }
}
