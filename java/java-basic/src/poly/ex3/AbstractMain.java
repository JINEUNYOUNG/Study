package poly.ex3;

public class AbstractMain {
    public static void main(String[] args) {
        //AbstractAnimal a = new AbstractAnimal() ;
        Dog dog = new Dog();
        Cat cat = new Cat();
        soundAnimal(cat);
        soundAnimal(dog);
        cat.sound();
        dog.sound();
        cat.move();
        dog.move();
    }
    private static void soundAnimal(AbstractAnimal a){
        System.out.println("테스트시작");
        a.sound();
        System.out.println("끝------");
    }
}
