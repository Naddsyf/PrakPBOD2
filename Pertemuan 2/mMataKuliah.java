/* Nama File : mMataKuliah.java
 * Deskripsi : Program untuk menguji fungsionalitas class MataKuliah
 * Pembuat   : Nadia Syifa Khairunnisa / 24060123120023
 * Tanggal   : 26 Februari 2025
 */
public class mMataKuliah {
    public static void main(String[] args) {
        //Membuat Objek Mata Kuliah
        MataKuliah MK1 = new MataKuliah();

        //Set data matkul
        MK1.setIdMatkul("PAIK6401");
        MK1.setNama("PBO");
        MK1.setSKS(3);
        System.out.println("=== Data Matkul ===");
        System.out.println("idMatkul :" + MK1.getIdMatkul());
        System.out.println("Nama Matkul : " + MK1.getNama());
        System.out.println("SKS Matkul : " + MK1.getSKS());
    }
}
