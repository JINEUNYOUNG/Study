package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {

        Animal[] animalArr = {new Pig(), new Dog(), new Cat(), new Caw(), new Duck()};

        //타입이 같으면 for문도 가능
        for (Animal x : animalArr){
            soundAnimal(x);
        }


    }

    private static void soundAnimal(Animal x) {
        System.out.println("테스트시작");
        x.sound();
        System.out.println("끝");
    }

}
