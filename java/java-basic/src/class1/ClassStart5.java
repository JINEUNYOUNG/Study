package class1;

public class ClassStart5 {
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

        Student[] students = {jin,kim};

//        for (int i = 0; i < students.length; i++){
//            System.out.println(students[i].name);
//            System.out.println(students[i].age);
//            System.out.println(students[i].grade);
//        }
//        for (int i = 0; i < students.length; i++){
//            Student s = students[i];
//            System.out.println(s.name);
//        }
        for (Student x : students) {
            System.out.println(x.name);
        }


    }
}
