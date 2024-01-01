package access.ex;

public class ShoppingCart {
    //1.쇼핑카트를 생성하고 초기화 함
    //2.addItem(Item객체) 해서 cart안에 추가 하는 역할. 10개까지
    //3.displayItems()해서 현재 카트 안을 돌면서 출력

    private Item[] items = new Item[10];
    private int itemCount = 0;

    //안의 상품을 출력.
    public void displayItems() {
        int total = 0;
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            System.out.println("현재," + items[i].getName());
        }
        System.out.println("현재 가격은 " + caculateTotalPrice()+"원입니다.");
    }

    public void addItem(Item item) {
        if (itemCount<10) { //0~9까지 10개 담김
            items[itemCount] = item;
            itemCount++;
        } else { //11번 부터
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
    }

    //계산하는 메서드.
    private int caculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            totalPrice += items[i].getTotalPrice();
        }
        return totalPrice;
    }
}
