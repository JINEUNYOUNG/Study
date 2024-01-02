package poly.basic;

public class CastingMain3 {
    public static void main(String[] args) {

        //업캐스팅
        //문제가 생길리가 없다. 상속받으면 부모자식 모두 인스턴스 생성되기 때문에. 있는 인스턴스를 찾아 캐스팅해주는 것이기 때문.
        Child child = new Child();
        Parent parent1 = child; //업캐스팅은 생략
        Parent parent2 = (Parent) child; //업캐스팅은 생략

        parent1.parentMethod();
        parent2.parentMethod();

    }
}
