package oop1;

public class MusicPlayer {

    int volume = 0;
    boolean isOn = false;

    //캡슐화:하나의캡슐에 묶어서 외부에 제공하는 것
    void showStatus(){
        if (isOn){
            System.out.println("켜져있음 볼륨은 "+volume);
        } else {
            System.out.println("꺼져있음.");
        }
    }
    void on(){
        isOn = true;
        System.out.println("켜졌습니다. ");
    }

    void off(){
        isOn = false;
        System.out.println("꺼졌습니다. ");
    }

    void volumeup(){
        volume++;
        System.out.println("지금볼륨은 "+volume);
    }

    void volumedown(){
        volume--;
        System.out.println("지금볼륨은 "+volume);
    }
}

