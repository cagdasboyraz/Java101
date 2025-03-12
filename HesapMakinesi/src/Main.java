import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, select;

        Scanner input = new Scanner(System.in);
        System.out.print("ilk sayiyi giriniz ");
        a = input.nextInt();
        System.out.print("ikinci sayiyi giriniz ");
        b = input.nextInt();

        System.out.println("1-toplama\n2-Cikarma\n3-Carpma\n4-bolme");
        System.out.println("seciminiz nedir: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplama "  + (a + b));
                break;
            case 2:
                System.out.println("Cikarma "  + (a - b));
                break;
            case 3:
                System.out.println("Carpma " + (a * b));
                break;
            case 4:
                System.out.println("bolme " + ((b !=0) ? (a/b) : "sonsuz"));
                break;
            default:
                System.out.println("hatali giris");
                break;
        }
    }
}
