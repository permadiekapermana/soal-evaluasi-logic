import java.util.Random;
import java.util.Scanner;

public class evaluasiSoal8 {

 public static void main(String[] args) {
  
  String[] tangan = {"Batu","Gunting","Kertas"};
  int batas, tangan_pem, tangan_mus;
  int score_pem = 0;
  int score_mus = 0;
  int putaran = 0;
  
  Scanner scan = new Scanner(System.in);
  Random rand = new Random();
  
    System.out.println("Rule : ");
    System.out.println("Batu selalu mengalahkan Gunting");
    System.out.println("Gunting selalu mengalahkan Kertas");
    System.out.println("Kertas selalu mengalahkan Batu");
    System.out.println();
    System.out.println("Mau main berapa putaran ? Tidak boleh lebih dari 100! : ");
    batas = scan.nextInt();
    
    while (putaran < batas && batas < 100 && batas !=0){
     System.out.println();
     System.out.println("1 : Batu");
     System.out.println("2 : Gunting");
     System.out.println("3 : Kertas");
     System.out.print("Masukkan Pilihanmu :");
     tangan_pem = scan.nextInt() - 1;
     tangan_mus = rand.nextInt(3);
     
     switch(tangan_pem){
      case 0:
      if (tangan_mus == 1){
       score_pem++;
      }else if (tangan_mus == 2){
       score_mus++;
      } 
      break;
      
      case 1:
      if (tangan_mus == 2){
       score_pem++;
      }else if (tangan_mus == 0){
       score_mus++;
      }
      break;
      
      case 2:
      if (tangan_mus == 0){
       score_pem++;
      }else if (tangan_mus == 1){
       score_mus++;
      }
      break;
     }
     System.out.println("Anda memilih : " + tangan[tangan_pem] + ", Musuh memilih : " + tangan[tangan_mus]);
     System.out.println("Score Sementara (Anda / Musuh): " + score_pem + " - " + score_mus);
     putaran++;
    }
    System.out.println();
    System.out.println("Score Akhir : " + score_pem + "-" + score_mus);
    
    if (score_pem > score_mus) {
        System.out.println("Hasil : Anda Menang");
    } else if (score_pem < score_mus) {
        System.out.println("Hasil : Anda Kalah");
    } else if (score_pem == score_mus) {
        System.out.println("Hasil : Seri");
    }

 }

}