import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n ;

        Scanner input = new Scanner(System.in);
        System.out.println("Eleman sayisini giriniz: ");
        n = input.nextInt();
        int a = 0 , b= 1;


        for (int i = 1; i<=n; i++){
            System.out.println(a + " ");
            int next = a + b;
            a = b;
            b = next;

        }
    }
}
