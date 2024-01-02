package poly.ex;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        System.out.println("테스트시작");
        dog.sound();
        System.out.println("테스트종료");

        System.out.println("테스트시작");
        cat.sound();
        System.out.println("테스트종료");

        soundCaw(caw); //이렇게 해도 같은 메서드를 3개 만들어야함
        //클래스 타입이 다르므로.. 같이 넘길 수도 없다. 타입을 같게 해주려면?
    }
    private static void soundCaw(Caw caw){
        System.out.println("테스트시작");
        caw.sound();
        System.out.println("테스트종료");
    }
}
