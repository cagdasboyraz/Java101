import java.util.Scanner;
//polindrom kelimeleri bulan program
public class Main {

    public static boolean isPolindrom(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrom2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return str.equals(reverse);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir kelime girin: ");
        String kelime = input.nextLine();

        if (isPolindrom(kelime)) {
            System.out.println("Girdiğiniz kelime bir palindromdur.");
        } else {
            System.out.println("Girdiğiniz kelime palindrom değildir.");
        }
    }
}
