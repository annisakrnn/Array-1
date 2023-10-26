import java.util.Scanner;
public class ArrayRataNilai04 {

    public static void main (String[] args) {
        Scanner scan04 = new Scanner(System.in);

        int[] nilaiMhs= new int[10];
        int lulus = 0;
        double total = 0;
        double rata2 = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = scan04.nextInt();
            
            if (nilaiMhs[i] > 70) {
                lulus++;
        }

        } 
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }
            rata2 = total/nilaiMhs.length;
            System.out.println("Rata-rata nilai = "+rata2);
            System.out.println("Jumlah mahasiswa yang lulus = " +lulus);

        }
    }

    

        
        
    

