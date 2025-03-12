import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sicaklik;
        boolean etkinlik1, etkinlik2, etkinlik3;

        Scanner inp = new Scanner(System.in);
        System.out.print("Hava kac derece " );
        sicaklik = inp.nextInt();

        etkinlik1 = sicaklik <= 5;
        etkinlik2 = sicaklik > 5 && sicaklik <= 15;
        etkinlik3 = sicaklik > 15 && sicaklik <= 25;

        if (etkinlik1) {
            System.out.println("kayak yapabilirsiniz");
        } else if (etkinlik2) {
            System.out.println("Sinemaya gidebilirsiniz");
        } else if (etkinlik3) {
            System.out.println("Piknik");
        } else {
            System.out.println("yuzmeye gidebilirsiniz");
        }
    }
}
