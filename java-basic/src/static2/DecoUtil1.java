package static2;

public class DecoUtil1 {
    //멤버변수도 없고, 기능만 존재한다.
    //근데 new 해서 객체 생성을 해야하나 ?
    public String deco(String str) {
        String result = "*" + str + "*";
        return result;
    }
}
