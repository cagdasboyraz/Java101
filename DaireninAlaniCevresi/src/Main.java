import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi =3.14;
        double yariCap;

        Scanner input = new Scanner(System.in);
        yariCap = input.nextDouble();

        double alan = (yariCap * yariCap) * pi ;

        System.out.println(alan);

    }
}
