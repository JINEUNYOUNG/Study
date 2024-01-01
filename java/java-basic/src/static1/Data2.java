package static1;

public class Data2 {

    public String name;

    public Data2(String name,Counter count) {
        this.name = name;
        count.count++; //기본 생성자로 초기화 할때 count++;
    }
}
