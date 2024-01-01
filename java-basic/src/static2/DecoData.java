package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;
    public static void staicCall(){
        //instanseValue++; 인스턴스변수 오류 (아직 생성도 되기 전이니까 불가능)
        //instanceMethod(); 인스턴스 메서드 오류

        staticValue++; //정적메서드->정적변수 접근
        staticMethod();//정적메서드->정적메서드
    };

    public void instanceCall(){
        instanceValue++; //+1해서 1되고,
        instanceMethod(); //그걸보여줌
        DecoData.staticValue++; //아까 +1했으니까 2되고
        DecoData.staticMethod();//보여줌
    }
    private void instanceMethod(){
        System.out.println("instanceValue는 "+instanceValue);
    }
    private static void staticMethod(){
        System.out.println("staticValue는 "+staticValue);
    }


}
