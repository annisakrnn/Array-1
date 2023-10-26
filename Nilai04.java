import java.util.Scanner;

public class Nilai04 {
    public static void main(String[] args) {
        Scanner scan04 = new Scanner(System.in);

        System.out.print("Masukkan banyaknya elemen dalam array: ");
        int banyakElemen = scan04.nextInt();

        int[] array = new int[banyakElemen];

        System.out.println("Masukkan elemen-elemen array:");
        for (int i = 0; i < banyakElemen; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = scan04.nextInt();
        }

        scan04.close(); 

        int nilaiTertinggi = cariNilaiTertinggi(array);
        int nilaiTerendah = cariNilaiTerendah(array);
        double nilaiRataRata = hitungRataRata(array);

        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai Terendah: " + nilaiTerendah);
        System.out.println("Nilai Rata-rata: " + nilaiRataRata);
    }

    public static int cariNilaiTertinggi(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int cariNilaiTerendah(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static double hitungRataRata(int[] array) {
        int total = 0;
        for (int nilai : array) {
            total += nilai;
        }
        return (double) total / array.length;
    }
}