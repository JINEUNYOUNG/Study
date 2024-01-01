package access.a;

import access.a.AccessData;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        data.publicField  = 1;
        data.publicField();

        data.defaultField = 2;
        data.defaultField();

        //data.privateField = 3; 접근 안됨..
        //private는 자기 안에서만 호출 되니까.

        data.innerAccess(); //이걸 호출해서 private에 접근
    }
}
