
import java.util.Scanner;

public class tugas1_03{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        int j, nilaiMhs[], totalNilai=0, tertinggi=0, terendah=100;
        double ratanilai;

        System.out.print("Masukkan jumlah semua mahasiswa :");
        j=sc.nextInt();

        nilaiMhs=new int[j];

        for(int i=0; i<nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i]=sc.nextInt();
        }
        for(int i=0; i<nilaiMhs.length; i++){
            totalNilai+=nilaiMhs[i];
        }
        ratanilai=totalNilai/nilaiMhs.length;
        for(int i=0; i<nilaiMhs.length; i++){
            if(nilaiMhs[i]>tertinggi){
                tertinggi=nilaiMhs[i];
            }
            if(nilaiMhs[i]<terendah){
                terendah=nilaiMhs[i];
            }
        }
        System.out.println("==============================");
        for(int i=0; i<nilaiMhs.length; i++){
            System.out.println("Nilai mahasiswa ke-"+(i+1)+" adalah "+nilaiMhs[i]);
        }
        System.out.println("nilai mahasiswa tertinggi adalah :"+tertinggi);
        System.out.println("nilai mahasiswa terendah adalah :"+terendah);
        System.out.println("rata-rata nilai seluruh mahasiswa adalah :"+ratanilai);
        System.out.println("==============================");
    }
}