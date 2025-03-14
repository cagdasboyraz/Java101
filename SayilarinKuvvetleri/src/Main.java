import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner input = new Scanner(System.in);
        System.out.println("Sayi giriniz " );
        n = input.nextInt();

        System.out.println("4'ün Kuvvetleri:");
        for (int i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }

        System.out.println("5'in Kuvvetleri:");
        for (int j = 1; j <= n; j *= 5) {
            System.out.println(j);
        }
    }
}
