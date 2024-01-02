package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {

        //자식->자식은 자식의 인스턴스에서 찾음
        Child child = new Child();
        System.out.println("child->child");
        System.out.println(child.value);
        child.method();

        //부모->부모는 부모의 인스턴스에서 찾음
        Parent parent = new Parent();
        System.out.println("parent->parent");
        System.out.println(parent.value);
        parent.method();

        //부모->자식은
        Parent parent1 = new Child();
        System.out.println("parent->Child");
        System.out.println(parent1.value); //변수는 부모
        parent1.method(); //메서드는 오버라이딩한 자식
        //부모 인스턴스에 가서 -> 메서드가 오버라이딩 됐다? 자식으로 간다. (우선권)
    }
}
