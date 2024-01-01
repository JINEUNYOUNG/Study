package ref;

public class Method1 {
    public static void main(String[] args) {


        Student student1 = new Student();
        initStudent(student1, "학생",14,90);

        Student student2 = new Student();
        initStudent(student2, "학생2",14,90);

        System.out.println(student1.name);
    }

    static void initStudent(Student student, String name, int age, int grade){
        student.name = name; //주소값을 찾아가서 name에 접근-> 값을 넣어줌
        student.grade = grade;
        student.age = age;
    }

}
