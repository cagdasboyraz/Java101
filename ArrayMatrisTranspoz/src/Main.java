// Matris Transpozunu Bulma
public class Main {

    static void trans(int[][] arr) {
        int[][] trp = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                trp[j][i] = arr[i][j];

            }
        }

        System.out.println("transpoz");
        for (int[] row : trp) {
            for (int i = 0; i < trp[0].length; i++) {
                System.out.print(row[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{2, 3, 4}, {5, 6, 4}};
        for (int[] row : arr) {
            for (int i = 0; i < arr[0].length; i++) {
                System.out.print(row[i] + " ");
            }
            System.out.println();
        }

        trans(arr);
        System.out.println("--------");
    }

}