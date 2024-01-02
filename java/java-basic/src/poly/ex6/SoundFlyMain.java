package poly.ex6;

public class SoundFlyMain {
    public static void main(String[] args) {

        Dog dog = new Dog(); //dog과 animal이 동시 생성됨
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundAnimal(dog); //animal틀에 dog을 넣었음.
        soundAnimal(bird);
        soundAnimal(chicken);
        //flyAnimal(dog);
        flyAnimal(bird);
        flyAnimal(chicken);

    }
    private static void soundAnimal(AbstractAnimal a) {
        a.sound();
    }

    private static void flyAnimal(Fly a) {
        a.fly();
    }

}
