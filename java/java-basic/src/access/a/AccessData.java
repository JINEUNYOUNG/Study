package access.a;

public class AccessData {

    public int publicField;
    int defaultField;
    private int privateField;

    public void publicField(){
        System.out.println("public"+publicField);
    }
    void defaultField(){
        System.out.println("default"+defaultField);
    }
    private void privateField(){
        System.out.println("private"+privateField);
    }
    public void innerAccess(){
        publicField =200;
        defaultField = 100;
        privateField = 300;
        System.out.println(privateField);
    } //같은 클래스 안에서는 문제 x (내부호출)
}
