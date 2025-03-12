import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunuz " );
        matematik = input.nextInt();
        System.out.print("fizik Notunuz " );
        fizik = input.nextInt();
        System.out.print("turkce Notunuz " );
        turkce = input.nextInt();
        System.out.print("kimya Notunuz " );
        kimya = input.nextInt();
        System.out.print("muzik Notunuz " );
        muzik = input.nextInt();

        int gecmeNotu = matematik + fizik + turkce + kimya + muzik;
        int not = gecmeNotu / 5;

        System.out.println("not "  + not);

        if (not <= 55){
            System.out.println("kaldiniz gecmis olsun");
        }else{
            System.out.println("gectiniz");

        }

    }
}
