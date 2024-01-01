package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student jin;
        jin = new Student(); //jin에는 참조값이 담긴다 -> class1.Student@30f39991

        jin.age = 12;
        jin.grade = 1;
        jin.name = "eunyoung";
        Student kim = new Student();
        kim.name = "yujeong";
        kim.age = 23;
        kim.grade = 2;

        System.out.println(jin); //class1.Student@30f39991
        System.out.println(kim); //class1.Student@452b3a41


    }
}
