import java.util.Arrays;
import java.util.Scanner;
//Dizideki elemanlari siralama
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Dizinin bouyu: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++){

            System.out.println((i + 1) + " .elemani giriniz");
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Sirali dizi");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");

        }

    }
}
