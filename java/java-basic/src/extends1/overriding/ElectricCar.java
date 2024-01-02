package extends1.overriding;

public class ElectricCar extends Car {
    public void charge(){
        System.out.println("충전");
    }
    @Override //(생략가능)프로그램이 읽을 수 있는 특별한 주석. 어노테이션. 상위클래스의 메소드를 엎어썼다.
    public void move(){
        System.out.println("이동합니다(수정)");
    }

}
