import java.util.Scanner;
public class ArrayRataNilai04Modifikasi2 {

    public static void main (String[] args) {
        Scanner scan04 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scan04.nextInt();


        int[] nilaiMhs = new int[jumlahMahasiswa];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + " : ");
            nilaiMhs[i] = scan04.nextInt();

            if (nilaiMhs[i] > 70) {
                jumlahLulus++;
                totalLulus += nilaiMhs[i];
            } else {
                jumlahTidakLulus++;
                totalTidakLulus += nilaiMhs[i];
            }
        }

        double rataLulus = totalLulus / jumlahLulus;
        double rataTidakLulus = totalTidakLulus / jumlahTidakLulus;

        System.out.println("Rata-rata nilai lulus: " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus: " + rataTidakLulus);
    }
}