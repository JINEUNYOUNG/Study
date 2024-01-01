package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        //절차지향 프로그래밍을 모듈화함
        //중복로직 제외되었고, 이름을 통해 로직 이해
        MusicPlayerData data = new MusicPlayerData();

        on(data);

        volumeup(data);

        volumeup(data);

        volumedown(data);

        showStatus(data);

        off(data);

    }
   static void showStatus(MusicPlayerData data){
       if (data.ison){
           System.out.println("켜져있음 볼륨은 "+data.volume);
       } else {
           System.out.println("꺼져있음.");
       }
   }
    static void on(MusicPlayerData data){
        data.ison = true;
        System.out.println("켜졌습니다. ");
    }

    static void off(MusicPlayerData data){
        data.ison = false;
        System.out.println("꺼졌습니다. ");
    }

    static void volumeup(MusicPlayerData data){
        data.volume++;
        System.out.println("지금볼륨은 "+data.volume);
    }

    static void volumedown(MusicPlayerData data){
        data.volume--;
        System.out.println("지금볼륨은 "+data.volume);
    }
}
