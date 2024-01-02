package poly.car0;

public class Driver {
    private K3Car k3Car;
    private Model3Car model3Car;
    public void setK3car(K3Car k3Car){
        this.k3Car = k3Car;
    }
    public void setmodel3Car(Model3Car model3Car){
        this.model3Car = model3Car;
    }
    public void drive(){
        System.out.println("운전한다.");
        if (k3Car != null){
            k3Car.startEngind();
            k3Car.offEngind();
            k3Car.pressAccelerator();
        } else if (model3Car != null){
            model3Car.startEngind();
            model3Car.offEngind();
            model3Car.pressAccelerator();
        }
    }
}
