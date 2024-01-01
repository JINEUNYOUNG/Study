package ref;

import java.util.Scanner;

public class ProductOrderMain23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력할 갯수 입력");
        int size = scanner.nextInt();
        scanner.nextLine();


        ProductOrder[] productOrder = new ProductOrder[size];

        for (int i = 0; i < productOrder.length; i++) {
            System.out.println("주문정보를 입력하세요.");
            System.out.print("상품명");
            String name = scanner.nextLine();

            System.out.print("가격 ");
            int price = scanner.nextInt();

            System.out.print("양  ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            productOrder[i] = createOrder(name, price, quantity);
        }

        printOrders(productOrder);

        int total = getTotalAmout(productOrder);
        System.out.println("총금액은"+total);
// 총 결제 금액 출력
    }
//
        static int getTotalAmout(ProductOrder[] productOrder) {
            int total = 0;
            for (ProductOrder order : productOrder) {
                total += order.price * order.quantity;
            }
            return total;

        }

    static ProductOrder createOrder(String name, int price, int quantity) {

        ProductOrder order = new ProductOrder();
        order.productName = name;
        order.price = price;
        order.quantity = quantity;

        return order;
    }

    static void printOrders(ProductOrder[] productOrder) {
        for (ProductOrder x : productOrder) {
            System.out.println(x.productName);
            System.out.println(x.price);
            System.out.println(x.quantity);
        }
    }
}
