package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data;
        data = new Data();
        //data = new Data(); 여기서 오류
        //data = 1; 참조값을 바꿀 순 없다. 참조 대상을 바꿀 수 없다는거지, 그 주소값을 찾아가서 다른 변수를 바꾸는건 문제없음.
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
        //이건 됨. value는 final아님.

    }
}
