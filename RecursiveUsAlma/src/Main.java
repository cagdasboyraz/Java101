import java.util.Scanner;

public class Main {

    static int usAlma(int taban, int us){


        if ( us == 0 ){
            return 1;
        }
        return taban * usAlma(taban, us - 1);

    }
    public static void main(String[] args) {
        int taban , us;
        Scanner input = new Scanner(System.in);
        System.out.println("taban " );
        taban = input.nextInt();

        System.out.println("us " );
        us = input.nextInt();

        System.out.println("sonuc "+ usAlma(taban , us));
    }
}
