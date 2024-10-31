
import java.util.Scanner;

public class tugas3_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String[] menu={"nasi Goreng", "Mie goreng", "Roti Bakar", "Kentang Goreng", "Teh tarik", "Cappucino", "chocolate ice"};
        String cariMakanan;
        int hasil=-1;
        
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        cariMakanan=sc.nextLine();

        for(int i=0; i<menu.length; i++){
            if (cariMakanan.equalsIgnoreCase(menu[i])) {
                hasil=i;
                break;
            }
        }if(hasil==-1){
            System.out.println(cariMakanan+" tidak tersedia tersedian");
        }else{
            System.out.println(cariMakanan+" tersedia");
        }


    }
}
