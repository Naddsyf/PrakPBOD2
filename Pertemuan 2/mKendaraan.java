/* Nama File : mKendaraan.java
 * Deskripsi : Program untuk menguji fungsionalitas class Kendaraan
 * Pembuat   : Nadia Syifa Khairunnisa / 24060123120023
 * Tanggal   : 26 Februari 2025
 */
public class mKendaraan {
    public static void main(String[] args) {
        //Membuat objek kendaraan
        Kendaraan K1 = new Kendaraan();
        
        K1.setJenis("Mobil");
        K1.setNoPlat("H4345");
        System.out.println("Kendaraan K1 dengan jenis " + K1.getJenis() + " Memiliki plat nomor " + K1.getNoPlat());

        K1.setJenis("Motor");
        K1.setNoPlat("H4547");
        System.out.println("Kendaraan K1 dengan jenis " + K1.getJenis() + "Memiliki plat nomor " + K1.getNoPlat());
    }
}
