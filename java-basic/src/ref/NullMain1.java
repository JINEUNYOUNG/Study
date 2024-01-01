package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println(data); //null

        data = new Data();
        System.out.println(data); //주소값

        data = null;
        System.out.println(data); //null
    }
}
