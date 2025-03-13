import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dogumYili;

        Scanner input = new Scanner(System.in);
        System.out.println("burcunuzu giriniz ");
        dogumYili = input.nextInt();

        if (dogumYili %12 == 0){
            System.out.println("burcunuz maymun");
        }else if (dogumYili %12 == 1){
            System.out.println("burcunuz horoz");
        } else if (dogumYili %12 == 2) {
            System.out.println("burcunuz kopek");

        }else if (dogumYili %12 == 3) {
            System.out.println("burcunuz domuz");

        }else if (dogumYili %12 == 4) {
            System.out.println("burcunuz fare");

        }else if (dogumYili %12 == 5) {
            System.out.println("burcunuz okuz");

        }else if (dogumYili %12 == 6) {
            System.out.println("burcunuz kaplan");

        }else if (dogumYili %12 == 7) {
            System.out.println("burcunuz tavsan");

        }else if (dogumYili %12 == 8) {
            System.out.println("burcunuz ejderha");

        }else if (dogumYili %12 == 9) {
            System.out.println("burcunuz yilan");

        }else if (dogumYili %12 == 10) {
            System.out.println("burcunuz at");

        }else if (dogumYili %12 == 11) {
            System.out.println("burcunuz koyun");

        }
    }
}
