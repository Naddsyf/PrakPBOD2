/*
 * File : TestPolimorfisme.java
 * Name : Nadia Syifa Khairunnisa
 * NIM  : 24060123120023
 * Date : 26 April 2025
 * Desc : Implementation of TestPolimorfisme (main)
 */

package PostTest;
import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args){
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (Pegawai emp : emps){
            emp.tampilData();
        }
    }
}

/*
 1. Hasil Ouput :
    Nama : Mira, Gaji Pokok : 5000000
    Bonus : 450000
    Nama : Joko, Gaji Pokok : 5000000
T   unjangan : 700000
    Nama : Argo, Gaji Pokok : 5000000
    Tunjangan : 700000

 2. Manfaat Polimorfisme:
    > Dapat menggunakan ArrayList<Pegawai> untuk menyimpan objek dari Manajer class dan Programmer class. 
    Tanpa polimorfisme, perlu membuat daftar terpisah untuk setiap jenis pegawai, yang akan membuat pengelolaan menjadi lebih rumit
    > Pemanggilan Metode Dinamis (Dynamic Method Dispatch). Metode tampilData() yang dijalankan saat runtime akan sesuai dengan jenis 
    objek sebenarnya (misalnya, Manajer atau Programmer), bukan hanya tipe referensinya (Pegawai). Ini memungkinkan satu loop bekerja dengan berbagai jenis pegawai.
    > Kode jadi lebih mudah dikembangkan dan dipelihara. Jika ingin menambahkan pegawai baru (misalnya staf) kita hanya perlu membuat class 
    staf yang mewarisi pegawai dan mengimplementasikan metode tampilData() yang sesuai karakteristik staf. Kode for loop di bagian main
    yang memanggil tampilData() tidak perlu diubah.

 3. Permasalahan jika penambahan pegawai4 dan pegawai5 tanpa polimorfisme:
    > Pengelolaan collection yang rumit. Jika pegawai4 dan pegawai5 ditambahkan tanpa polimorfisme, kita tidak dapat dengan mudah menyimpan semua objek pegawai dalam satu 
    ArrayList bertipe Pegawai. Kita mungkin perlu membuat ArrayList terpisah untuk setiap jenis pegawai.
    > Untuk melakukan operasi metode yang sama (misalnya tampilData()), perlu menulis for loop terpisah untuk setiap jenis collection
    > Kode menjadi kurang fleksibel dan sulit untuk diperluas. Jika ada kebutuhan untuk memproses semua pegawai secara umum (misalnya, menghitung total gaji semua pegawai), 
    kita perlu menulis logika yang berbeda untuk setiap jenis koleksi.
 */