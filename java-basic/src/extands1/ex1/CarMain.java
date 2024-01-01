package extands1.ex1;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar eleccar = new ElectricCar();
        eleccar.move();
        eleccar.charge();
        GasCar gascar = new GasCar();
        gascar.move();
        gascar.fillUp();
        //이동이라는 개념은 공통됨

    }
}
