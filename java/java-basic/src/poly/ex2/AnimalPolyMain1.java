package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal caw = new Caw();
        Animal duck = new Duck();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(duck); //추가도 문제없다.
    }
    private static void soundAnimal(Animal animal){ //하나의 메서드를 작성했으나 여러 메서드를 실행
        System.out.println("테스트시작");
        animal.sound(); //메서드는 오버라이드 해뒀기 떄문에
        System.out.println("종료");
    }
}
