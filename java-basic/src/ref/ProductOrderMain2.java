package ref;

public class ProductOrderMain2 {
    public static void main(String[] args) {
// 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] productOrder = new ProductOrder[3];

// createOrder()를 여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장
        productOrder[0] = createOrder("두부",2000,2);
        productOrder[1] = createOrder("김치",5000,1);
        productOrder[2] = createOrder("콜라",1500,2);

// printOrders()를 사용해서 상품 주문 정보 출력d
        printOrders(productOrder[0]);
        printOrders(productOrder[1]);
        printOrders(productOrder[2]);

// getTotalAmount()를 사용해서 총 결제 금액 계산
        int total = getTotalAmout(productOrder);
        System.out.println("총금액은"+total);
// 총 결제 금액 출력
    }

    static int getTotalAmout(ProductOrder[] productOrder) {
        int total = 0;
        for (ProductOrder order : productOrder) {
            total += order.price * order.quantity;
        }
        return total;

    }

    static ProductOrder createOrder(String name, int price, int quantity){

        ProductOrder order = new ProductOrder();
        order.productName = name;
        order.price = price;
        order.quantity = quantity;

        return order;
    }
    static void printOrders(ProductOrder productOrder){
        System.out.println(productOrder.productName);
        System.out.println(productOrder.price);
        System.out.println(productOrder.quantity);
    }
}
