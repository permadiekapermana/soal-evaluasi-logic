public class evaluasiSoal10spiral {
    public static void main(String[] args) {
        
        String input = "Programmer";
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
        System.out.println("Hasil :");

        String[][] spiral = new String[jmlBaris][jmlKolom];
        
        spiral[pointerBaris][pointerKolom] = input.charAt(0)+ "";
        pointerKolom++;
        spiral[pointerBaris][pointerKolom] = input.charAt(1)+ "";
        pointerBaris++;
        spiral[pointerBaris][pointerKolom] = input.charAt(2)+ "";
        pointerKolom--;
        spiral[pointerBaris][pointerKolom] = input.charAt(3)+ "";
        pointerKolom--;
        spiral[pointerBaris][pointerKolom] = input.charAt(4)+ "";
        pointerBaris--;
        spiral[pointerBaris][pointerKolom] = input.charAt(5)+ "";
        pointerBaris--;
        spiral[pointerBaris][pointerKolom] = input.charAt(6)+ "";
        pointerKolom++;
        spiral[pointerBaris][pointerKolom] = input.charAt(7)+ "";
        pointerKolom++;
        spiral[pointerBaris][pointerKolom] = input.charAt(8)+ "";
        pointerKolom++;
        spiral[pointerBaris][pointerKolom] = input.charAt(9)+ "";

        System.out.println();
        for (int i=0; i<spiral.length; i++) {
            for (int j=0; j<spiral[i].length; j++) {
                if (spiral[i][j]==null) {
                    System.out.print("-");
                } else {
                    System.out.print(spiral[i][j]+ " ");
                }
            }
            System.out.println();
        }

    }
}
