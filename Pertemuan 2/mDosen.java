/* Nama File : mDosen.java
 * Deskripsi : Program untuk menguji fungsionalitas class Dosen
 * Pembuat   : Nadia Syifa Khairunnisa / 24060123120023
 * Tanggal   : 26 Februari 2025
 */
public class mDosen {
    public static void main(String[] args) {
        //Membuat objek dosen
        Dosen D1 = new Dosen();

        //Set data diri dosen
        D1.setNip("12345");
        D1.setNama("Lana");
        D1.setProdi("Informatika");

        System.out.println("=== Data Diri Dosen ===");
        System.out.println("Nip : " + D1.getNip());
        System.out.println("Nama : " + D1.getNama());
        System.out.println("Prodi : " + D1.getProdi());
    }
}
