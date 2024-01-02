package poly.ex5;

import poly.ex4.AbstractAnimal;

public class InterfaceAnimalMain {
    public static void main(String[] args) {
        //InterfaceAnimal inter = new InterfaceAnimal();
        InterfaceAnimal cat = new Cat();
        InterfaceAnimal dog = new Dog();
//        cat.move();
//        dog.move();
//        cat.sound();
//        dog.sound();
        soundAnimal(cat);
        soundAnimal(dog);
        moveAnimal(cat);
        moveAnimal(dog);
    }

    private static void soundAnimal(InterfaceAnimal a) {
        System.out.println("테스트시작");
        a.sound();
        System.out.println("끝------");
    }

    private static void moveAnimal(InterfaceAnimal a) {
        System.out.println("테스트시작");
        a.move();
        System.out.println("끝------");
    }
}