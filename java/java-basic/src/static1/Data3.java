package static1;

public class Data3 {

    public String name;

    public static int count; //static변수(정적변수)
    //static이 붙으면, 메서드 영역에서 관리된다. 힙이아닌.
    //생성하면 -> 생성자가 호출되고,

    public Data3(String name) { //생성 시 생성자가 호출되고,
        this.name = name;
        Data3.count++; //이 때, static이므로 메서드영역에 count값이 ++
    }
}
