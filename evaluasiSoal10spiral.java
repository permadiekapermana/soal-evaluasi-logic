import java.util.Scanner;

public class evaluasiSoal10spiral {
    public static void main(String[] args) {

        System.out.println("Masukkan kalimat :");
        Scanner inputan = new Scanner(System.in);
        String input = inputan.nextLine();

        if(input.length()>250){       
            System.out.println("Panjang Kalimat yang diinputkan tidak boleh lebih dari 250 karakter!");
        }else if (input.length()<=250){          
        
            int jmlBaris = evaluasiSoal10set.getBaris(input.length());
            int jmlKolom = evaluasiSoal10set.getKolom(input.length());
        
            System.out.println("Kalimat yang diInputkan adalah : ");
            System.out.println(input);
            System.out.println();

            System.out.println("Debugging :");
            int panjangKalimat = input.length();
            System.out.println("Panjang Kalimat = " + panjangKalimat);
            System.out.println("Jumlah Baris = " + jmlBaris);
            System.out.println("Jumlah Kolom = " + jmlKolom);

            int centerBaris = (int) Math.ceil((float) jmlBaris / (float) 2) - 1;
            int centerKolom = (int) Math.ceil((float) jmlKolom/ (float) 2) - 1;

            System.out.println("Titik Tengah Baris = " + centerBaris);
            System.out.println("Titik Tengah Kolom = " + centerKolom);

            int pointerBaris = centerBaris;
            int pointerKolom = centerKolom;

            System.out.println("Pointer Tengah Baris = "+ pointerBaris);
            System.out.println("Pointer Tengah Kolom = "+ pointerKolom);

            System.out.println();
            System.out.println("Hasil Matrix :");

            String[][] spiral = new String[jmlBaris][jmlKolom];

            for (int i=0; i <panjangKalimat; i++) {
                int ar = i+1;
                spiral[pointerBaris][pointerKolom] = input.charAt(i) + "";
                int arrowArray = evaluasiSoal10set.getDirection(ar);
                if (arrowArray == 1) {
                    pointerKolom++;
                } else if (arrowArray == 2) {
                    pointerBaris++;
                } else if (arrowArray == 3) {
                    pointerKolom--;
                } else if (arrowArray == 0) {
                    pointerBaris--;
                }
            }

            System.out.println();
            for (int i=0; i<spiral.length; i++) {
                for (int j=0; j<spiral[i].length; j++) {
                    if (spiral[i][j]==null) {
                        System.out.print("- ");
                    } else if (spiral[i][j].equals(" ")) {
                        System.out.print("- ");
                    } else {
                        System.out.print(spiral[i][j]+ " ");
                    }
                }
                System.out.println();
            }

            System.out.println();
            System.out.println("Hasil Penyandian :");
            System.out.println();
            for (int i=0; i<spiral.length; i++) {
                for (int j=0; j<spiral[i].length; j++) {
                    if (spiral[i][j]==null) {
                        System.out.print("-");
                    } else if (spiral[i][j].equals(" ")) {
                        System.out.print("-");
                    } else {
                        System.out.print(spiral[i][j]);
                    }
                }
            }

        } // end if

    }
}
