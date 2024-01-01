package variable.ex;

public class While {
    public static void main(String[] args) {
        int count = 0;
        int count1 =0;
        int rows = 2;
        while (count <= rows) { //0 1 2
            while (count1 <= count) { //0
                System.out.print("*");
                count1++;
            }
            System.out.println("");
            count1 = 0;
            count++;
        }
    }
}
