package final1;

public class FieldInit {

    static final int CONST_VALUE = 10; //관례상 대문자.
    //static final로 바뀌지않는 공용변수가 되는 것.
    //어차피 메서드 영역에 단 하나만 존재하게 된다.
    //힙영역에 생성되지 않는.

    final int value = 10;

//    public FieldInit() {
//        //this.value=value; 불가능함. 아까 초기화 할 때 할당 했잖니
//    }
}
