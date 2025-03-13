import java.util.Scanner;
/*
java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM),
yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın.
İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
 */
public class Main {
    public static void main(String[] args) {
        int mesafe, yas, yolculukTip;
        double fiyat, indirim, indirimliDonus, indirimliFiyat;

        Scanner input = new Scanner(System.in);
        System.out.print("mesafe giriniz: ");
        mesafe = input.nextInt();

        System.out.print("yasinizi giriniz: ");
        yas = input.nextInt();

        System.out.print("yolculuk tipini giriniz\n 1-tek yon \n 2-gidis donus : ");
        yolculukTip = input.nextInt();

        fiyat = mesafe * 0.10;
        indirim = 0;

        if (yas < 12) {
            indirim = fiyat * 0.50;
        } else if (yas >= 12 && yas <= 24) {
            indirim = fiyat * 0.10;
        } else if (yas > 65) {
            indirim = fiyat * 0.30;
        }
        indirimliFiyat = fiyat - indirim;

        if (yolculukTip == 1) {
            System.out.println("tek yon sectiniz indirim yok");
        } else if (yolculukTip == 2) {
            fiyat = indirimliFiyat * 0.20;
        }
        if (mesafe > 0 && yas > 0 && (yolculukTip == 1 || yolculukTip == 2)) {
            System.out.println("Bilet Fiyatı: " + indirimliFiyat + " TL");
        } else {
            System.out.println("Hatalı veri girdiniz!");
        }
    }


}
