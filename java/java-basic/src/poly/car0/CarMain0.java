package poly.car0;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3 = new K3Car();

        driver.setK3car(k3);
        driver.drive();

        Model3Car model3car = new Model3Car();
        driver.setK3car(null);//this.k3Car = null을 해줘서 참조값을 없애준것.
        driver.setmodel3Car(model3car);
        driver.drive();
    }
}
