package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {

        //메서드를 호출할 수 있기만 하면 된다. 어떻게 짜졌는지 알 필요없이..
        //변경도 쉽고, 메서드 이름으로 어떤 기능을 실행하는지 알아보기도 쉽다.
        MusicPlayer player = new MusicPlayer();
        player.on();
        player.volumeup();
        player.volumeup();
        player.volumedown();
        player.showStatus();
        player.off();

    }
}
