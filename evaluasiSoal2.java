import java.util.Scanner;

public class evaluasiSoal2 {
    public static void main(String[] args) {
        
        int i, j, N;
        System.out.println("Masukan nilai N : ");
        Scanner inputan = new Scanner(System.in);
        N = inputan.nextInt();

        if(N<=20){
		
		for (i = 1; i <= N; i++) {
            for (j = 1; j <= N; j++) {
                System.out.print("#");
            }System.out.println("");
        }

        }else if (N>20){
            System.out.println("Angka tidak boleh lebih dari 20!");
        }

    }
}
