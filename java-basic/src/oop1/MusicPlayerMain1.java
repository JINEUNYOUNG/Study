package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        //절차지향 프로그래밍

        int volume = 0;
        boolean isOn = false;

        isOn = true;
        System.out.println("음악플레이어 시작 ");

        volume++;
        System.out.println("볼륨"+volume);

        volume++;
        System.out.println("볼륨"+volume);

        volume--;
        System.out.println("볼륨"+volume);

        System.out.println("상태확인 ");
        if (isOn){
            System.out.println("켜져있음 볼륨은 "+volume);
        } else {
            System.out.println("꺼져있음.");
        }

        isOn = false;
        System.out.println("종료합니다.");

    }
}
