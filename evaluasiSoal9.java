import java.util.Scanner;

public class evaluasiSoal9 {
    public static void main(String[] args) {
        
        int a,b,c,d,e,f;
        String i;

        System.out.println("-- Selamat Datang di Aplikasi Sederhana Penghitung Jumlah Menang dan Kalah --");
        System.out.println("Masukkan Jumlah Menang dan Kalah dari Joko, Tukiman dan Supratman secara berurutan.");
        System.out.println("Pisahkan dengan spasi!");
        Scanner input = new Scanner(System.in);
        i = input.nextLine();
        System.out.println();

        String[] splitString = i.split(" ");

        a = Integer.parseInt(splitString[0]);
        b = Integer.parseInt(splitString[1]);
        c = Integer.parseInt(splitString[2]);
        d = Integer.parseInt(splitString[3]);
        e = Integer.parseInt(splitString[4]);
        f = Integer.parseInt(splitString[5]);

        int ab = a+b;
        int cd = c+d;
        int ef = e+f;

        if (ab != cd) {
            System.out.println("Jumlah Menang Joko dan Tukiman Tidak Sama!");
        } else if (ab != ef) {
            System.out.println("Jumlah Menang Joko dan Supratman Tidak Sama!");
        } else if (ab == cd && ab == ef) {
            System.out.println("Angka cocok!");
            System.out.println();

            int jum_menang = a + c + e;
            int jum_kalah = b + d + f;

            System.out.println("Jumlah Joko : Menang = "+a+", Kalah = "+b);
            System.out.println("Jumlah Tukiman : Menang = "+c+", Kalah = "+d);
            System.out.println("Jumlah Supratman : Menang = "+e+", Kalah = "+f);
            System.out.println();

            System.out.println("Total Menang Semua Pemain : "+jum_menang);
            System.out.println("Total Kalah Semua Pemain : "+jum_kalah);
            int total_game = (a + b) * 2;
            System.out.println("Total Game : "+total_game);
            System.out.println();
            
            int menang_joko = total_game - jum_menang;
            int kalah_joko = total_game - jum_kalah;
            System.out.println("Total Menang Bejo : "+menang_joko);
            System.out.println("Total Kalah Bejo : "+kalah_joko);

        }

    }
}