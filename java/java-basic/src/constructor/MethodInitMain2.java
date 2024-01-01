package constructor;

public class MethodInitMain2 {
    public static void main(String[] args) {

        MemberInit2 member1 = new MemberInit2("은영",2);

        MemberInit2 member2 = new MemberInit2("은영",1111,111);

        System.out.println(member1.grade);
        System.out.println(member2.grade);


    }

}
