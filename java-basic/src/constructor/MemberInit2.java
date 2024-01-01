package constructor;

public class MemberInit2 {
    String name;
    int grade;
    int age;

    MemberInit2(String name, int age){
        this(name, age, 50); //아래 오버로딩된 생성자를 부르는 것.
        //그러니까, grade를 안보내줬어도 아래 생성자를 사용할 수 있도록 하나 추가해서 보내주는 것
        //꼭 첫줄에만 가능하다.
        System.out.println("good");//은 되는데,
        //this(name, age, 50); //이건 안돼요

    }
    MemberInit2(String name, int age, int grade){ //오버로딩
        this.name = name;
        this.age = age;
        this.grade = 20;
    }


}
