package extends1.super1.child;

import extends1.super1.parent.Parent;

public class Child extends Parent {
    public String value = "child";

    @Override
    public void hello() {
        System.out.println("child.hello");
    }

    public void call(){
        System.out.println("this value는 "+this.value); //생략해도 내것부터 찾음
        System.out.println("super value는 "+super.value);

        this.hello();
        super.hello(); //이름이 같으면 부모클래스에 접근하려면 super하는 것. 다르면 안써도 잘 찾아간다.

    }
}
