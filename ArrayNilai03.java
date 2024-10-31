
import java.util.Scanner;

public class ArrayNilai03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] nilaiAkhir = new int[10];

        for (int i=0; i<10; i++ ){
            System.out.print("masukkan nilai mahasiswa ke-"+i+" : ");
            nilaiAkhir[i]=sc.nextInt();
        }for (int i=0; i<10; i++){
            System.out.println("Nilai mahasiswa ke-"+i+" adalah "+nilaiAkhir[i]);
        }
    }
    
}
