package extends1.overriding;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar eleccar = new ElectricCar();
        eleccar.move(); //오버라이딩됨.
        eleccar.charge();
        eleccar.openDoor();
    }
}
