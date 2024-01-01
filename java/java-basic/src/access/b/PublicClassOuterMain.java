package access.b;

import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        //다른패키지지만 public이라서 오케
        PublicClass publicClass = new PublicClass();
        //DefaultClass.. default->다른패키지라 접근안됨.
    }
}
