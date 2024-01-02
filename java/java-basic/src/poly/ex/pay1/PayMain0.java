package poly.ex.pay1;

import java.util.Scanner;

public class PayMain0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        PayService payService = new PayService();

        //kakao 결제
        while(true) {
            System.out.println("결제수단을 입력하세요.");
            String option = scanner.nextLine();
            System.out.println("결제금액을 입력하세요.");
            int amount = scanner.nextInt();
            payService.processPay(option, amount);
            scanner.nextLine();

        }


    }
}
