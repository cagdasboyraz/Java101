import java.util.Scanner;

public class Main {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("toplam: " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("cikarma islemi: " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("carpma " + result);
        return result;
    }

    static int bolme(int a, int b) {
        int result = a / b;
        System.out.println("bolme " + result);
        return result;
    }

    static int usluSayi(int a, int b) {

        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;


        }
        return result;


    }

    static int mod(int a, int b) {
        return a % b;
    }

    static int calc(int a, int b) {
        System.out.println("cevresi: " + (2 * (a + b)));
        System.out.println("alani: " + (a * b));
        return 0;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1- toplama islemi\n"
                + "2- Cikarma islmei\n"
                + "3- Carpma islmei\n"
                + "4- bolme islemi\n"
                + "5- Uslu sayi hesaplama\n"
                + "6- Mod alma\n"
                + "7- dikdorgenin alani ve cevre hesabi\n"
                + "0- Cikis yap\n";

        System.out.println(menu);
        while (true) {

            System.out.print("Bir islem seciniz: ");
            select = input.nextInt();

            if (select == 0) {
                break;
            }

            System.out.print("ilk sayi: ");
            int a = input.nextInt();
            System.out.print("ikinci sayi: ");
            int b = input.nextInt();


            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    if (bolme(a, b) == 0) {
                        System.out.println("ikinci sayi 0 dan farkli olmali ");
                    }
                    break;
                case 5:
                    usluSayi(a, b);
                    break;
                case 6:
                    System.out.println("mod islemi: " + mod(a, b));
                    break;
                case 7:
                    calc(a, b);
                    break;
                default:
                    System.out.println("gecersiz bir islem girdiniz ");


            }
        }
        System.out.println("gule gule");
    }
}
