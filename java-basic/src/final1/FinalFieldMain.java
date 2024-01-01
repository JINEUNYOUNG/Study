package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        System.out.println("생성자초기화");
        ConstructInit one = new ConstructInit(1); //매개변수를 넘겼더니 final로 지정해뒀을때,
        ConstructInit two = new ConstructInit(2); //이경우는 다른 값을 넘기면 각각 다른값 가능
        //one = 20; 안됨 final함
        System.out.println(one.value);
        System.out.println(two.value);

        System.out.println("필드초기화");
        FieldInit field1 = new FieldInit(); //필드에서 생성과 동시에 final 로
        FieldInit field2 = new FieldInit(); //이경우엔 무조건 같은값
        FieldInit field3 = new FieldInit(); //>>>>>>메모리 낭비<<<<<<  => static영역을 사용하자.
        System.out.println(field2.value);
        System.out.println(field1.value);


        System.out.println(FieldInit.CONST_VALUE); //이렇게 메서드 영역의 static변수를 갖고와 쓰자는 것
        System.out.println(FieldInit.CONST_VALUE);
        System.out.println(FieldInit.CONST_VALUE);

        //field1 = 2;

        //상수
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);
    }
}
