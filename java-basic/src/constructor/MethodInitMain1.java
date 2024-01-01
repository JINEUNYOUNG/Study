package constructor;

public class MethodInitMain1 {
    public static void main(String[] args) {

        MemberInit member1 = new MemberInit();
        member1.initMember("은영",123,35);

        MemberInit member2 = new MemberInit();
        member2.initMember("유정",23,90);

        MemberInit[] members = {member1, member2};

        for (MemberInit x : members){
            System.out.println(x.name + x.age+x.grade);
        }


    }

}
