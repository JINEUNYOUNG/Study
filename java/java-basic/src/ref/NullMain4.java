package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); //주소생성
        System.out.println(bigData.count); //0
        System.out.println(bigData.data); //주소

        System.out.println(bigData.data.value); //0
    }
}
