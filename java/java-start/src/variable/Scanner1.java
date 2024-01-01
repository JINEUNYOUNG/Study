package variable;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("5번쓰세여");
        int[] a = new int[5];
        String answer = "";
        for (int i = 0; i < 5; i++) {
            a[i] = scanner.nextInt();
            if (i == a.length) {
                answer += a[i];
            } else {
                answer += a[i]+", ";

            }
        }
        System.out.print(answer);





    }
}
