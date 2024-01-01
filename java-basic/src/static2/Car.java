package static2;

public class Car {
    private String name  = "";
    private static int count = 0;
    public Car(String car) {
        System.out.println("구매한 차량 "+car);
        this.name = car;
        count++;
    }
    public static void showTotalCars(){
        System.out.println("현재"+count);
    }

}
