import java.util.Scanner;

public class evaluasiSoal3 {
    public static void main(String[] args) {

        int i, j, N;
        System.out.println("Masukan nilai N : ");
        Scanner inputan = new Scanner(System.in);
        N = inputan.nextInt();
        
        if(N<=5000){
            for (i=1; i<=N; i++) {
                    j = i%10;                
                    System.out.print(j  + " ");
            }
        }else if (N>5000){
            System.out.println("Angka tidak boleh lebih dari 5000!");
        }

    }
}