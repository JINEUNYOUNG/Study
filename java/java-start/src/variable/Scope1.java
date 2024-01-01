package variable;

public class Scope1 {
    public static void main(String[] args) {
        int m = 2;
        int s =2;
        if (true){
            System.out.println(m);
            int n = 1;
            System.out.println(n);
            s = 1;
            System.out.println(s);
        }
        System.out.println(s); //1
       // System.out.println(n); //에러
    }
}
