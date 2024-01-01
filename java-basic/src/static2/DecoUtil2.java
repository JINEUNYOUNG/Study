package static2;

public class DecoUtil2 {
    //멤버변수도 없고, 기능만 존재한다.
    //근데 new 해서 객체 생성을 해야하나 ?
    public static String deco(String str) { //이러면 정적메소드
        String result = "*" + str + "*";
        return result;
    }
}
