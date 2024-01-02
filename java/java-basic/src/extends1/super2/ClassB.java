package extends1.super2;

public class ClassB extends ClassA{
    public ClassB(int a) {
        //super(); 이건 생략가능. 매개변수 없는 생성자는 알아서 호출됨.
        this(a,0); //this를 100번 호출하더라도 마지막은 super()해줘야함.
        System.out.println("classb생성자 a= "+a);
    }
    public ClassB(int a, int b){
        super();
        System.out.println("classb생성자 a= "+a+", b = "+b);

    }
}
