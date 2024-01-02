package poly.ex.pay1;

public class PayStore {
    public static Pay findPay(String a) {
        if (a.equals("kakao")) {
            return new KakaoPay();
        }
         else if(a.equals("naver")) {
            return new NaverPay();
        } else{
            return new DefaltPay();
        }

    }
}