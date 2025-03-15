import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int toplam = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        n = input.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                toplam += i;
            }
        }

        if (toplam == n) {
            System.out.println(n + " mükemmel sayıdır.");
        } else {
            System.out.println(n + " mükemmel sayı değildir.");
        }
    }
}