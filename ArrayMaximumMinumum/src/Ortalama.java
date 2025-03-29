public class Ortalama {
    public class Main {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5}; // 5 elemanlı bir dizi oluşturduk.
            int sum = 0; // Toplamı tutmak için bir değişken tanımladık.
            double harmonik = 0.0; // Harmonik toplamı tutmak için ondalıklı bir değişken tanımladık.

            for (int i = 0; i < numbers.length; i++) { // Dizinin tüm elemanlarını dolaşıyoruz.
                sum += numbers[i]; // Her elemanı toplama ekliyoruz.
            }

            System.out.println("Ortalama: " + sum / numbers.length); // Toplamı dizi uzunluğuna bölerek ortalamayı hesaplıyoruz.

            for (double j = 1; j <= numbers.length; j++) { // 1'den dizi uzunluğu kadar olan sayılar için döngü başlatıyoruz.
                harmonik += (1.0 / j); // Her adımda 1/j değerini toplama ekliyoruz.
            }

            System.out.println("Harmonik Ortalama: " + harmonik); // Harmonik ortalamayı ekrana yazdırıyoruz.
        }
    }

}
