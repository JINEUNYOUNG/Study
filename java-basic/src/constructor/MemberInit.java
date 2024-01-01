package constructor;

public class MemberInit {
    String name;
    int grade;
    int age;

    void initMember(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    MemberInit(){
        //기본생성자. 적지않아도 자동으로 생성
    }


}
