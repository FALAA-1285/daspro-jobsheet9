
import java.util.Scanner;

public class ArrayRataNilai03{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double total=0, rata2;
        System.out.print("masukkan jumlah mahasiswa: ");
        int p=sc.nextInt();
        int[] nilaiMhs= new int[p];
        

        for (int i=0; i<nilaiMhs.length; i++ ){
            System.out.print("masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i]=sc.nextInt();
        }for(int i=0; i<nilaiMhs.length; i++){
            total+=nilaiMhs[i];
        }
        rata2=total/nilaiMhs.length;
        System.out.println("rata rata nilai = "+rata2);        
        for (int i=0; i<nilaiMhs.length; i++){
            if(nilaiMhs[i]>70){
                System.out.println("mahasiswa ke-"+(i+1)+" lulus");
            }else{
                System.out.println("mahasiswa ke-"+(i+1)+" tidak lulus");
            }
        }
    }
}