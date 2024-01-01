package static1;

public class DataCountMain1 {
    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println(data1.count);

        Data1 data2= new Data1("A");
        System.out.println(data1.count);

        Data1 data3 = new Data1("A");
        System.out.println(data1.count);

        // 다 다른 인스턴스를 참조하기 때문에 count는 모두 1
    }
}
