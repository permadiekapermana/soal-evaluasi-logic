import java.util.Scanner;
 
public class evaluasiSoal7belum {
        public static void main(String args[])
        {
            Scanner s = new Scanner(System.in);
            
            System.out.println("Masukkan Bilangan Biner :");
            int n = s.nextInt();
            System.out.println();
            
            int decimal, p;

            decimal = 0;
            p = 0;
            
            while(n!=0)
            {
                decimal+=((n%10)*Math.pow(2,p));
                n=n/10;
                p++;
            }
            
            if (decimal >= 0 && decimal <=127) {
                System.out.println("Hasil Konversi Binernya adalah :");
                System.out.println(decimal);
            } else {

            }

        }
}