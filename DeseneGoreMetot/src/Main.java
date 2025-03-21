import java.util.Scanner;

public class Main {

    static void adet(int n) {
        System.out.println(n + " ");
        if (n > 0) {
            adet(n - 5);
        } else if (n == 0) {
            adet(n + 5);
        }

        if (n != 0) {
            System.out.println(n + " ");
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("sayi giriniz ");
        int n = input.nextInt();
        adet(n);
    }
}
