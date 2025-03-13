import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int toplam = 0;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Sayi giriniz: ");
            n = inp.nextInt();

            if ((n % 2 == 0) && (n % 4 == 0)) {
                toplam += n;
            }

        } while (n % 2 == 0);

        System.out.println("Toplam: " + toplam);


    }
}
