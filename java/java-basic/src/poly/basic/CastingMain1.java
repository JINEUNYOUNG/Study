package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        Parent poly = new Child();
        //부모->자식 참조

        //poly.childMethod(); 이건안됨

        //다운캐스팅하자(강제로!)
        Child child = (Child)poly; //타입바꾸기(그냥은 안됨. 자식에 부모를 넣을 순 없다)
        child.childMethod();

        poly.parentMethod(); //캐스팅은 어차피 복사해서 넣는거라 본체가 바뀐건 아니다.
        ((Child) poly).childMethod(); //요렇게 가능
        //(Child) poly.childMethod(); 이러면 뒤가 먼저라서..오류남
    }
}
