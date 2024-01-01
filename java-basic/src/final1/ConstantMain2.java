package final1;

public class ConstantMain2 {
    public static void main(String[] args) {
        System.out.println("최대"+Constant.MAX_USERS); //이제 숫자는 저 상수 값만 바꿔주면 됨.
        int currentUserCount = 999;
        process(currentUserCount++); //999
        process(currentUserCount++); //1000
        process(currentUserCount++); //1001

    }

    private static void process(int a){
        System.out.println("참여자수"+a);
        if (a > Constant.MAX_USERS){ //변수명을 보고 추측할 수 있다는 점도 장점.
            System.out.println("대기자");
        } else {
            System.out.println("참여합니다.");
        }
    }
}
