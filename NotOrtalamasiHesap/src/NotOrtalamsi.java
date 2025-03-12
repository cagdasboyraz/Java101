import java.util.Scanner;

public class NotOrtalamsi {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner input = new Scanner(System.in);

        System.out.print("matematik notunz " );
        mat= input.nextInt();

        System.out.print("fizik notunz " );
        fizik= input.nextInt();

        System.out.print("kimya notunz " );
        kimya= input.nextInt();

        System.out.print("turkce notunz " );
        turkce= input.nextInt();

        System.out.print("tarih notunz " );
        tarih= input.nextInt();

        System.out.print("muzik notunz " );
        muzik= input.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik );
        double sonuc = toplam / 6.0;
        System.out.println("ortalamaniz : "+ sonuc);

        if (sonuc>50){
            System.out.println("gectiniz");
        }else{
            System.out.println("kaldiniz");
        }
    }
}
