package extends1.ex2;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar eleccar = new ElectricCar();
        eleccar.move(); //ElectricCar->Car->move
        eleccar.charge();
        GasCar gascar = new GasCar();
        gascar.move();
        gascar.fillUp();
    }
}
