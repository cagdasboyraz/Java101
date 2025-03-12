import java.util.Scanner;

public class Main {
    /*
Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin
kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
Meyveler ve KG Fiyatları
Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL

 */

    public static void main(String[] args) {
        double armut;
        double elma;
        double domates;
        double muz;
        double patlican;

        Scanner input = new Scanner(System.in);
        System.out.print("kac kilo armut aldiniz " );
        armut = input.nextDouble();
        System.out.print("kac kilo elma aldiniz " );
        elma = input.nextDouble();
        System.out.print("kac kilo domates aldiniz " );
        domates = input.nextDouble();
        System.out.print("kac kilo muz aldiniz " );
        muz = input.nextDouble();
        System.out.print("kac kilo patlican aldiniz " );
        patlican = input.nextDouble();


        armut = armut * 2.14;
        elma = elma * 3.67;
        domates = domates * 1.11;
        muz = muz * 0.95;
        patlican = patlican * 5.00;

        double toplamTutar = armut + elma + domates + muz + patlican;
        System.out.println(toplamTutar);





    }
}
