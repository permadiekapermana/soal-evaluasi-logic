import java.util.Scanner;

public class evaluasiSoal6 {
    public static void main(String[] args) {

        int N;
        System.out.println("Masukan nilai N : ");
        Scanner inputan = new Scanner(System.in);
        N = inputan.nextInt();
        System.out.println();

        if (N<-127 || N>127) {
            System.out.print("Batas input angka adalah -127 sampai 127!");
        } else {
            if (N>=0) {
                StringBuilder buf1 = new StringBuilder();
                StringBuilder buf2 = new StringBuilder();
                while (N != 0){
                    int digit = N % 2;
                    buf1.append(digit);
                    N = N/2;
                }
                String binary=buf1.reverse().toString();
                int length=binary.length();
                if(length<8){
                while (8-length>0){
                    buf2.append("0");
                    length++;
                }
                }
                String bin=buf2.toString()+binary;
                System.out.println(bin);
            }
            else if (N<0) {
                int n2 = Math.abs(N);
                StringBuilder buf1 = new StringBuilder();
                StringBuilder buf2 = new StringBuilder();
                while (n2 != 0){
                    int digit = n2 % 2;
                    buf1.append(digit);
                    n2 = n2/2;
                }
                String binary=buf1.reverse().toString();
                int length=binary.length();
                if(length<8){
                while (8-length>0){
                    buf2.append("0");
                    length++;
                }
                }
                String bin=buf2.toString()+binary;
                
                String[] b = bin.split("");
                               
                for (int i = 0; i < 8; i++){
                    int foo = Integer.parseInt(b[i]);
                    if (foo==0) {
                        System.out.print("1");
                    } else if (foo==1) {
                        System.out.print("0");
                    }
                }

            }
        }        
    
    }
    
}
