package extends1.ex;

public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public void print(){
        System.out.print("부모이름:"+name+", 부모가격:"+price+" ");
    }

    public int getPrice(){
        return this.price;
    }
}
