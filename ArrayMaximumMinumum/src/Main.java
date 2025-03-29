import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.println(Arrays.toString(arr));
        int num;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        for (int i : arr) {
            if (i < num && i > min) {
                min = i;
            }

            if (i > num && i < max) {
                max = i;

            }
        }

        System.out.println("Minumum deger " + min);
        System.out.println("Maximum deger " + max);
    }
}
