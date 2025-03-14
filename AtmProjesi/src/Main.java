import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int selectk;
        int price = 0;

        while (right > 0) {
            System.out.print("Kullanici adiniz: ");
            userName = input.nextLine();
            System.out.println("Parolanizi giriniz: ");
            password = input.nextLine();

            if (userName.equals("cagdas") && (password.equals("qweasd"))) {
                System.out.println("hosgeldiniz");

                do {
                    System.out.println("1- para yatirma: \n" +
                            "2- para cekme \n" +
                            "3- bakiye sorgulama \n" +
                            "4- cikis yap");
                    System.out.println("lutfen yapmak istediginizi seciniz");
                    selectk = input.nextInt();

                    switch (selectk) {
                        case 1:
                            System.out.print("para miktari ");
                            System.out.println("yatirilicak miktar ");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("cekmek istediginiz miktar  ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("bakiye yetersiz ");
                            } else {
                                balance -= price;
                                System.out.println("cekme islemi tamam ");

                            }
                            break;
                        case 3:
                            System.out.print("bakiyeniz: " + balance);
                            break;
                        case 4:
                            System.out.println("Çıkış yapılıyor...");
                            break;
                        default:
                            System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");

                    }

                } while (selectk != 4);
                System.out.println("tekrar gorusmek uzere");
                break;
            } else {
                right--;
                System.out.println("kullanici adiniz ve sifreniz hatali tekrar deneyiniz");
                if (right == 0) {
                    System.out.println("Hesabiniz bloke olmustur");

                } else {
                    System.out.println("kalan hakkiniz " + right);
                }
            }
        }
    }
}
