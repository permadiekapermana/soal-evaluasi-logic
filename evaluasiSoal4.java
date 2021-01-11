import java.util.Scanner;

public class evaluasiSoal4 {
    public static void main(String[] args) {

        int i;
        Scanner show = new Scanner(System.in);
        System.out.println("Masukan Jumlah Deret Sampai Angka ke- :");
        int N = show.nextInt();
        System.out.print("Angka yang anda masukkan : ");

        if (N%2==0){
            System.out.println("Bilangan Genap");
        } else {
            System.out.println("Bilangan Ganjil");
        }

        System.out.println();

        if(N<=50){
                 
        if (N%2==0){
            for (i = 1; i <= N; i++) {
                if (i%2==0) {
                    System.out.print(i +  " ");
                }
            }
        } else {
            for (i = 1; i <= N; i++) {
                if (i%2==1) {
                    System.out.print(i +  " ");
                }
            }
        }        

        }else if (N>50){
            System.out.println("Angka tidak boleh lebih dari 50!");
        }

    }
}
