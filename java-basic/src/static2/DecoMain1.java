package static2;

public class DecoMain1 {
    public static void main(String[] args) {
        //멤버변수도 없고, 기능만 존재한다.
        //근데 new 해서 객체 생성을 해야하나 ?
        String s = "hello java";
        DecoUtil1 util = new DecoUtil1();
        String deco = util.deco(s);
        System.out.println("before : "+s);
        System.out.println("after : "+deco);
    }
}
