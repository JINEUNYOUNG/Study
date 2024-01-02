package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        call(parent1);//parent->child로 못담으니까..x

        System.out.println("---------");

        Parent parent2 = new Child();
        call(parent2); //child->child로 담을수있으니 다운캐스팅
    }

    private static void call(Parent parent){
        parent.parentMethod();
        if (parent instanceof Child child){  //변수선언가능.
            System.out.println("child 인스턴스");
            child.childMethod();
        }
    }
}
