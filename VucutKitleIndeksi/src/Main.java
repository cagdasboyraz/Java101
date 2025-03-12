import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kilo, boy;

        Scanner input = new Scanner(System.in);
        System.out.print("kilonuzu giriniz " );
        kilo = input.nextDouble();
        System.out.print("boyunuzu giriniz " );
        boy = input.nextDouble();

        double kitle = kilo / (boy * boy);
        System.out.println("vucut kitle indeksiniz " + kitle);
    }
}
