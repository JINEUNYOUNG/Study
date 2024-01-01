package variable.ex;

public class VarEx3 {
    public static void main(String[] args) {
        int grade = 2;
        int coupon;

        if (grade ==1){
            coupon = 1000;
        } else if (grade ==2){
            coupon = 2000;
        } else if (grade ==3){
            coupon =  3000;
        } else {
            coupon = 4000;
        }

        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2 :
                coupon = 2000;
                break;
            case 3 :
                coupon = 3000;
                break;
            default :
                coupon = 4000;
        }


    }
}
