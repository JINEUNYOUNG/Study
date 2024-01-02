package poly.basic;

public class CastingMain4 {
    public static void main(String[] args) {

        //다운캐스팅
        //위험! 자식인스턴스가 인스턴스에 없을 수 있다. 오류날 가능성.
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();

        Parent parent2 = new Parent(); //메모리에 parent인스턴스하나 (자식은없다)
        //Child child2 = (Child) parent2; //캐스팅오류남 (자식은 아에 없으니까)
        //child2.parentMethod(); //실행x

    }
}
