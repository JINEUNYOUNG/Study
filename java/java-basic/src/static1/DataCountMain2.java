package static1;

public class DataCountMain2 {
    public static void main(String[] args) {
        Counter count = new Counter(); //여기서 초기화 하고 확인
        Data2 data1 = new Data2("A",count);
        System.out.println(count.count);

        Data2 data2= new Data2("A",count);
        System.out.println(count.count);

        Data2 data3 = new Data2("A",count);
        System.out.println(count.count);

        // 다 다른 인스턴스를 참조하기 때문에 count는 모두 1
    }
}
