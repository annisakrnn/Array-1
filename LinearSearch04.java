import java.util.Scanner;

public class BubbleSortExample04 {

    public static void main (String[] args) {
        Scanner scan04 = new Scanner(System.in);

        System.out.print("Masukkan banyak elemen array : ");
        int banyakElemen = scan04.nextInt();
        
        int[] arrayInt = new int[banyakElemen];

        for (int i = 0; i < banyakElemen; i++) {
            System.out.print("Masukkan elemen array ke-" + (i + 1) + ": ");
            arrayInt[i] = scan04.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari: ");
        int key = scan04.nextInt();
        int hasil = -1;

        for (int i = 0; i < banyakElemen; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }

        if (hasil != -1) {
            System.out.println("Key ditemukan-" + hasil);
        } else {
            System.out.println("Key tidak ditemukan");
        }
    }
}