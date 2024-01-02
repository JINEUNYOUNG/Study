package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        call(parent1);//parent->child로 못담으니까..x

        System.out.println("---------");

        Parent parent2 = new Child();
        call(parent2); //child->child로 담을수있으니 다운캐스팅
    }

    private static void call(Parent parent){
        if (parent instanceof Child){  //다운캐스팅 하기전에 안전하게요.. 인스턴스 체크한다음에 다운캐스팅
            System.out.println("child 인스턴스");
            Child child = (Child) parent;
            child.childMethod();
        } else { //여긴 다운캐스팅하면 터져요
            System.out.println("child 인스턴스 아님");
        }
    }
}
