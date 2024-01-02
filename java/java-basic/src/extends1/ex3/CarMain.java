package extends1.ex3;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar eleccar = new ElectricCar();
        eleccar.move(); //ElectricCar->Car->move
        eleccar.charge();
        eleccar.openDoor();

        GasCar gascar = new GasCar();
        gascar.move();
        gascar.fillUp();
        gascar.openDoor();

        HydrogenCar hycar = new HydrogenCar();
        hycar.move();
        hycar.fillHydrogen();
        hycar.openDoor();
    }
}
