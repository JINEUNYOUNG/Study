package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        System.out.println("-----------parent->parent참조");
        Parent parent = new Parent();
        parent.parentMethod();

        System.out.println("-----------child->child참조");
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        //다형적 참조
        System.out.println("-----------parent->child참조");
        Parent poly = new Child(); //자식을 부모에 대입 (가능)
        //Child poly = new Parent(); 이건 안됨. 자식은 부모를 담을 수 없음.
        poly.parentMethod();
        //poly에 참조값이 있는거니까, 그 메모리에 가서 현재 Parent모양이니 그쪽으로 가서 찾는다. 부모에서 자식으로 호출할 순 없음.
        //그럼 child 메소드는 어차피 못ㅆ는건데 왜 다형적 참조를 하지? (차근히..)
        //poly.childMethod(); 부모타입이기 때문에 자식메서드를 쓸 순 없다.(부모로 찾아가도 메서드가 없잖아)
    }
}
