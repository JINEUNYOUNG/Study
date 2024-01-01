package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A"); //생성자호출
        System.out.println(Data3.count); //1

        Data3 data2= new Data3("A");
        System.out.println(Data3.count); //2

        Data3 data3 = new Data3("A");
        System.out.println(Data3.count); //3
        System.out.println(data3.count); //3

        // static변수를 클래스부르듯 Data3.count로 하면 정적변수인 static변수에 접근 해서
        // 각자 count변수를 만들지 않게 됨.
    }
}
