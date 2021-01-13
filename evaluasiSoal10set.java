public class evaluasiSoal10set {

    public static void main(String[] args) {

        System.out.println("Nilai Jumlah Baris 1 = " + getBaris(1));
        System.out.println("Nilai Jumlah Baris 2 = " + getBaris(2));
        System.out.println("Nilai Jumlah Baris 3 = " + getBaris(3));
        System.out.println("Nilai Jumlah Baris 4 = " + getBaris(4));
        System.out.println("Nilai Jumlah Baris 5 = " + getBaris(5));
        System.out.println("Nilai Jumlah Baris 6 = " + getBaris(6));
        System.out.println("Nilai Jumlah Baris 7 = " + getBaris(7));
        System.out.println("Nilai Jumlah Baris 8 = " + getBaris(8));
        System.out.println("Nilai Jumlah Baris 9 = " + getBaris(9));
        System.out.println("Nilai Jumlah Baris 10 = " + getBaris(10));
        System.out.println("Nilai Jumlah Baris 11 = " + getBaris(11));
        System.out.println("Nilai Jumlah Baris 12 = " + getBaris(12));
        System.out.println("Nilai Jumlah Baris 13 = " + getBaris(13));
        System.out.println("Nilai Jumlah Baris 14 = " + getBaris(14));
        System.out.println("Nilai Jumlah Baris 15 = " + getBaris(15));
        System.out.println("Nilai Jumlah Baris 16 = " + getBaris(16));
        System.out.println("Nilai Jumlah Baris 17 = " + getBaris(17));
        System.out.println("Nilai Jumlah Baris 18 = " + getBaris(18));
        System.out.println("Nilai Jumlah Baris 19 = " + getBaris(19));
        System.out.println("Nilai Jumlah Baris 20 = " + getBaris(20));
        System.out.println("Nilai Jumlah Baris 21 = " + getBaris(21));
        System.out.println("Nilai Jumlah Baris 22 = " + getBaris(22));
        System.out.println("Nilai Jumlah Baris 23 = " + getBaris(23));
        System.out.println("Nilai Jumlah Baris 24 = " + getBaris(24));
        System.out.println("Nilai Jumlah Baris 25 = " + getBaris(25));
        System.out.println("Nilai Jumlah Baris 26 = " + getBaris(26));
        System.out.println();

        System.out.println("Nilai Jumlah Kolom 1 = " + getKolom(1));
        System.out.println("Nilai Jumlah Kolom 2 = " + getKolom(2));
        System.out.println("Nilai Jumlah Kolom 3 = " + getKolom(3));
        System.out.println("Nilai Jumlah Kolom 4 = " + getKolom(4));
        System.out.println("Nilai Jumlah Kolom 5 = " + getKolom(5));
        System.out.println("Nilai Jumlah Kolom 6 = " + getKolom(6));
        System.out.println("Nilai Jumlah Kolom 7 = " + getKolom(7));
        System.out.println("Nilai Jumlah Kolom 8 = " + getKolom(8));
        System.out.println("Nilai Jumlah Kolom 9 = " + getKolom(9));
        System.out.println("Nilai Jumlah Kolom 10 = " + getKolom(10));
        System.out.println("Nilai Jumlah Kolom 11 = " + getKolom(11));
        System.out.println("Nilai Jumlah Kolom 12 = " + getKolom(12));
        System.out.println("Nilai Jumlah Kolom 13 = " + getKolom(13));
        System.out.println("Nilai Jumlah Kolom 14 = " + getKolom(14));
        System.out.println("Nilai Jumlah Kolom 15 = " + getKolom(15));
        System.out.println("Nilai Jumlah Kolom 16 = " + getKolom(16));
        System.out.println("Nilai Jumlah Kolom 17 = " + getKolom(17));
        System.out.println("Nilai Jumlah Kolom 18 = " + getKolom(18));
        System.out.println("Nilai Jumlah Kolom 19 = " + getKolom(19));
        System.out.println("Nilai Jumlah Kolom 20 = " + getKolom(20));
        System.out.println("Nilai Jumlah Kolom 21 = " + getKolom(21));
        System.out.println("Nilai Jumlah Kolom 22 = " + getKolom(22));
        System.out.println("Nilai Jumlah Kolom 23 = " + getKolom(23));
        System.out.println("Nilai Jumlah Kolom 24 = " + getKolom(24));
        System.out.println("Nilai Jumlah Kolom 25 = " + getKolom(25));
        System.out.println("Nilai Jumlah Kolom 26 = " + getKolom(26));
            
    }

    public static int getBaris(int lengthData) {

        int counter = 0;
        int nilai=1;
        while(counter != lengthData) {
            for (int j=0; j<nilai*2; j++) {
                counter++;
                if (counter == lengthData) {
                    break;
                }
                
            }
            nilai++;
        }        
        return nilai-1;

    }

    public static int getKolom(int lengthData) {

        int counter = 0;
        int nilai= 0;
        while(counter != lengthData) {
            for (int j=1; j<nilai*2; j++) {
                counter++;
                if (counter == lengthData) {
                    break;
                }
                
            }
            nilai++;
        }        
        return nilai-1;

    }
    

}
