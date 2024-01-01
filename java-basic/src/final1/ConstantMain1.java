package final1;

public class ConstantMain1 {
    public static void main(String[] args) {
        System.out.println("최대"+1000);
        int currentUserCount = 999; //이러면 숫자 바꾸려면 세군데나 바꿔야해 ..
        process(currentUserCount++); //999
        process(currentUserCount++); //1000
        process(currentUserCount++); //1001

    }

    private static void process(int a){
        System.out.println("참여자수"+a);
        if (a > 1000){
            System.out.println("대기자");
        } else {
            System.out.println("참여합니다.");
        }
    }
}
