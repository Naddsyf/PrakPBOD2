/* Nama File : mTitik.java
 * Deskripsi : Program untuk menguji fungsionalitas class titik
 * Pembuat   : Nadia Syifa Khairunnisa / 24060123120023
 * Tanggal   : 19 Februari 2025
 */
public class mTitik {
    public static void main(String[] args) {
        titik T1 = new titik();
        T1.setAbsis(8);
        T1.setOrdinat(5);
        T1.printTitik();


        titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        titik T3 = new titik(4,2);
        T3.printTitik();
        System.out.println("Jumlah Objek Titik = " + titik.getcounterTitik());
        System.out.println("Titik T3 ada di kuadran : " + T3.getKuadran());
        System.out.println("Jarak T1 terhadap pusat: " + T1.getJarakPusat());
        System.out.println("Jarak T1 dengan titik lain : " + T1.getJarak(T3));
        
        T3.refleksiX();
        T3.printTitik();
        titik T4 = T3.getRefleksiX();
        T4.printTitik();
        
        titik T5 = T3.getRefleksiY();
        T5.printTitik();

        System.out.println("Jumlah Objek Titik = " + titik.getcounterTitik());
    }
}
