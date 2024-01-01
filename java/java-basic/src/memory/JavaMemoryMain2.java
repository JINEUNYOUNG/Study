package memory;

public class JavaMemoryMain2 {
    public static void main(String[] args) {
        System.out.println("main s"); //1
        method1();
        System.out.println("main e"); //6
    }
    static void method1(){
        System.out.println("method1 s"); //2
        Data data1 = new Data(10); //지역변수 data1 선언,초기화(스택안에->new하면 힙영역안에, 변수안엔 주소값)
        method2(data1);
        System.out.println("method1 e");//5 이 때 지역변수 data1도 사라진다.
        //이제 힙영역의 data 인스턴스를 참조하는 애가 없다. 가비지 컬렉션은 이런걸 찾아 메모리에서 제거한다.
    }

    static void method2(Data data2){//주소값ㅇㄹ 넘김
        System.out.println("method2 s"); //3
        System.out.println("data.value="+data2.getValue()); //10
        System.out.println("method2 e"); //4 이때 매개변수 data2도 제거댑니다.
    }
}
