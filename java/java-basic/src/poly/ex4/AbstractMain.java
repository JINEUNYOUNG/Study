package poly.ex4;

public class AbstractMain {
    public static void main(String[] args) {
        //AbstractAnimal a = new AbstractAnimal() ;
        Dog dog = new Dog();
        Cat cat = new Cat();
        soundAnimal(cat);
        soundAnimal(dog);
        moveAnimal(cat);
        moveAnimal(dog);

    }
    private static void soundAnimal(AbstractAnimal a){
        System.out.println("테스트시작");
        a.sound();
        System.out.println("끝------");
    }
    private static void moveAnimal(AbstractAnimal a){
        System.out.println("테스트시작");
        a.move();
        System.out.println("끝------");
    }
}
