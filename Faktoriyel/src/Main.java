import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, k;
        int total = 1;
        int total2 = 1;
        int total3= 1;
        Scanner input = new Scanner(System.in);
        System.out.println("sayi giriniz");
        n = input.nextInt();
        System.out.println("sayi giriniz");
        k = input.nextInt();


        for (int i = 1; i <=n; i ++ ){
            total = total * i;

        }
        for (int i = 1; i <= k; i++){
            total2 = total2 * i;
        }

        for (int i = 1; i <= (n-k); i++){
            total3 = total3 * i;
        }
        int faktoriyel = total / (total2 * total3);

        System.out.println("C(" + n + "," + k + ") = " + faktoriyel);
    }
}
