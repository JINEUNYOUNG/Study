package poly.car1;

public class Driver {
    private Car car;

    public void setCar(Car car){
        System.out.println("자동차설정");
        this.car = car;
    }
    //새로운 차 객체가 생겨도 driver는 고칠 일이 없다.
    //ocp open closed principal 추가에는 열려있고, 기존 코드 수정에는 닫혀있다.
     public void drive(){
        System.out.println("운전한다.");
        car.startEngind();
        car.offEngind();
        car.pressAccelerator();
    }
}
