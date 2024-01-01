package pack;

import pack.a.User; //모든 클래스.
import pack.a.User2; //모든 클래스.
//import pack.b.User; 이렇겐 안댄당.

public class PackageMain1 {
    public static void main(String[] args) {

        Data data = new Data();
        User user = new User(); //import해서 갖다 쓰는거임
        User2 user3 = new User2(); //import해서 갖다 쓰는거임
        pack.b.User user4 = new pack.b.User(); //이렇게써줘야..
        pack.a.User user2 = new pack.a.User(); //패키지까지 명시해서 불러온거임
    }

}