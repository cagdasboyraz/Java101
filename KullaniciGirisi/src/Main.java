import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String kullanci, sifre;

        Scanner input = new Scanner(System.in);
        System.out.println("Kullanici adiniz");
        kullanci = input.nextLine();
        System.out.println("Sfire giriniz");
        sifre = input.nextLine();

        if (kullanci.equals("cado") && (sifre.equals("qweasd"))){
            System.out.print("basarili giris yaptiniz " );
        }else {
            System.out.print("bilgileriniz hatali " );
        }
    }
}
