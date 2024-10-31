
import java.util.Scanner;

public class tugas2_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String daftarMenu[];
        int hargaMenu[], j;
        

        int totalHarga=0;
        System.out.print("masukkan jumlah pesanan: ");
        j=sc.nextInt();

        daftarMenu=new String[j];
        hargaMenu=new int[j];

        for(int i=0; i<daftarMenu.length; i++){
            System.out.print((i+1)+". masukkan pesanan ke-"+(i+1)+" : ");
            daftarMenu[i]=sc.nextLine();
            sc.nextLine();
            System.out.print("=> harga "+daftarMenu[i]+" : Rp.");
            hargaMenu[i]=sc.nextInt();
        }
        for(int  i=0; i<hargaMenu.length; i++){
            totalHarga+=hargaMenu[i];
        }
        System.out.println("================================");
        System.out.println("---------Daftar pesanan---------");
        for(int  i=0; i<hargaMenu.length; i++){
            System.out.println((i+1)+". "+daftarMenu[i]+" : Rp."+hargaMenu[i]);
        }
        System.out.println("Total harga: Rp."+totalHarga);
        System.out.println("================================");

    }
}
