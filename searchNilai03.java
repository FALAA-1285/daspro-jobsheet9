
import java.util.Scanner;

public class searchNilai03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int key, hasil=0;
        System.out.print("Masukkan banyak nilai yang ingin diinput :");
        int p=sc.nextInt();
        int[] arrNilai=new int[p];
        for(int i=0; i<arrNilai.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            arrNilai[i]=sc.nextInt();
        }
        System.out.print("Masukkan nilai key :");
        key=sc.nextInt();
        for(int i=0; i<arrNilai.length; i++){
            if (key==arrNilai[i]){
                hasil = i+1;
                break;
            }
        }
        if(hasil==0){
            System.out.println();
            System.out.println("nilai yang dicari tidak ditemukan");
            System.out.println();
        }else{
            System.out.println();
            System.out.println("nilai "+key+" ketemu di mahasiswa ke-"+hasil);
            System.out.println();
        }
        
        
    }
}
