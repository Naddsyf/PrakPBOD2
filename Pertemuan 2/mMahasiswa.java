/* Nama File : mMahasiswa.java
 * Deskripsi : Program untuk menguji fungsionalitas class Mahasiswa
 * Pembuat   : Nadia Syifa Khairunnisa / 24060123120023
 * Tanggal   : 27 Februari 2025
 */

public class mMahasiswa {
    public static void main(String[] args) {
    /* ======= Membuat Objek Dosen ======= */
        Dosen dosen1 = new Dosen("198903032015042002","Khadijah, S.Kom., M.Cs.","Informatika");
        Dosen dosen2 = new Dosen("198009142006041002", "Edy Suharto, S.T., M.Kom","Informatika");

    /* ======= Membuat Objek MataKuliah ======= */
        MataKuliah MK1 = new MataKuliah("PAIK6401", "Pemrograman Berorientasi Objek",3);
        MataKuliah MK2 = new MataKuliah("PAIK6406","Sistem Cerdas",3);
        MataKuliah MK3 = new MataKuliah("PAIK6403","Manajemen Basis Data",3);
        MataKuliah MK4 = new MataKuliah("PAIK6201","Matematika II",2);

    /* ======= Membuat Objek Kendaraan ======= */
        Kendaraan kendaraan1 = new Kendaraan("XY456WZ","Motor");
        Kendaraan kendaraan2 = new Kendaraan("BC789DE","Mobil");
        
    /* ======= Membuat Objek Mahasiswa ======= */
    Mahasiswa MHS1 = new Mahasiswa("24060123120023","Nadia Syifa Khairunnisa","Informatika");
    Mahasiswa MHS2 = new Mahasiswa("24060123100001","Ruka Yudi","Informatika");
    Mahasiswa MHS3 = new Mahasiswa("24060123100002","Angelia Kala","Informatika");

    MHS1.setDosenWali(dosen1);
    MHS1.addMatkul(MK1);
    MHS1.addMatkul(MK2);
    MHS1.addMatkul(MK3);
    MHS1.setKendaraan(kendaraan1);

    MHS2.setDosenWali(dosen2);
    MHS2.addMatkul(MK2);
    MHS2.addMatkul(MK3);
    MHS2.setKendaraan(kendaraan2);

    MHS3.setDosenWali(dosen1);
    MHS3.addMatkul(MK4);
    MHS3.setKendaraan(null);
    
    System.out.println("\n=== Informasi Mahasiswa1 ===");
    System.out.println("Jumlah SKS MHS1 : " + MHS1.getJumlahSKS() + " SKS");
    System.out.println("Jumlah Matkul MHS1 : " + MHS1.getJumlahMatkul() + " Matkul");
    MHS1.printDetailMhs();

    System.out.println("\n=== Informasi Mahasiswa2 ===");
    System.out.println("Jumlah SKS MHS2 : " + MHS2.getJumlahSKS() + " SKS");
    System.out.println("Jumlah Matkul MHS2 : " + MHS2.getJumlahMatkul() + " Matkul");
    MHS2.printDetailMhs();

    System.out.println("\n=== Informasi Mahasiswa3 ===");
    System.out.println("Jumlah SKS MHS3 : " + MHS3.getJumlahSKS() + " SKS");
    System.out.println("Jumlah Matkul MHS3 : " + MHS3.getJumlahMatkul() + " Matkul");
    MHS3.printDetailMhs();
    }
}
