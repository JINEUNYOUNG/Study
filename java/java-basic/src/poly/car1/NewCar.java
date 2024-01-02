package poly.car1;

public class NewCar implements Car{
    public void startEngind(){
        System.out.println("새차 engine on");
    }
    public void offEngind(){
        System.out.println("새차 engine off");
    }
    public void pressAccelerator(){
        System.out.println("새차 accel");
    }
}