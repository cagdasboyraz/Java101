import java.util.Arrays;

public class Main {
    // Frekans hesaplama hangi sayi kac kez tekrar etmis.
    public static void main(String[] args) {
        int [] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println(Arrays.toString(arr));
        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i< arr.length;i++){
            if (visited[i]){
                continue;
            }
            int count = 1;
            for (int j = 0; j< arr.length;j++){
                if (arr[i] == arr[j]){
                    count ++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " sayisi " + count + " tekrar edildi");
        }
    }
}
