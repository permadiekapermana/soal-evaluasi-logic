import java.util.Scanner;
 
public class evaluasiSoal7 {

        static char flip(char c) {
            return (c == '0') ? '1' : '0';
        }
        
        static int binaryToDecimal(int n)
        {
            int num = n;
            int dec_value = 0;
    
            int base = 1;
    
            int temp = num;
            while (temp > 0) {
                int last_digit = temp % 10;
                temp = temp / 10;
    
                dec_value += last_digit * base;
    
                base = base * 2;
            }
    
            return dec_value;
        }
 
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
            } else if (decimal >=128 && decimal <=256) {
                String complement1 = "";
                String bin = String.valueOf(n);
                char[] temp = new char[bin.length()];
                temp = bin.toCharArray();
                for (int k = 0; k < temp.length; k++) {
                    complement1 += flip(bin.charAt(k));
                }
                int c = Integer.parseInt(complement1);
                int hasil2 = binaryToDecimal(c);
                System.out.println("Hasil konversi Binernya adalah :");
                System.out.println("- "+ hasil2);
            }

        }
}