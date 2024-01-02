package poly.ex.pay0;

public class PayMain0 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        //kakao 결제
        payService.processPay("kakao", 100);
        payService.processPay("naver", 100);
        payService.processPay("g", 100);



    }
}
