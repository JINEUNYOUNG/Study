package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s); //static이라 정적 메소드면 이렇게 가능 new 안해도!
        System.out.println("before : "+s);
        System.out.println("after : "+deco);
    }
}
