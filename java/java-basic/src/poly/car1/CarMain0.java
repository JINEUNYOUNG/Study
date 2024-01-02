package poly.car1;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3 = new K3Car();
        driver.setCar(k3);
        driver.drive();

        Model3Car m3 = new Model3Car();
        driver.setCar(m3);
        driver.drive();

        NewCar newcar = new NewCar();
        driver.setCar(newcar);
        driver.drive();
    }
}
