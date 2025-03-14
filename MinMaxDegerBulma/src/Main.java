import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, sayi, max, min;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz: ");
        n = input.nextInt();

        System.out.print("1. sayıyı giriniz: ");
        sayi = input.nextInt();

        max = sayi;
        min = sayi;

        for (int i = 1; i < n; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz: ");
            sayi = input.nextInt();

            if (sayi > max) {
                max = sayi;
            }
            if (sayi < min) {
                min = sayi;
            }
        }


        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}