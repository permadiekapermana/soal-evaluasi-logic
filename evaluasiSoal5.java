import java.util.Scanner;

public class evaluasiSoal5 {
    public static void main(String[] args) {

        int i;
        Scanner show = new Scanner(System.in);
        System.out.println("Masukan Jumlah Deret Fibonacci :");
        int N = show.nextInt();

        if(N<=50){

        long fib[] = new long[N];
         
        fib[0] = 0;
        fib[1] = 1;
         
        for(i = 2; i < N; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
         
        for (i = 0; i < N; i++) {
            System.out.print(fib[i] +  " ");
        }

        }else if (N>50){
            System.out.println("Angka tidak boleh lebih dari 50!");
        }

    }
}
