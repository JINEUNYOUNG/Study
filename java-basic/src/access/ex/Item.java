package access.ex;

public class Item {

    //필드선언
    private String name;
    private int price;
    private int quantity;

    //생성자
    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


    //메서드
    public String getName() {
        return name;
    }
    public int getTotalPrice() {
        return price * quantity;//총 가격을 리턴
    }

}
