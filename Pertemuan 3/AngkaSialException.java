/* Nama File : AngkaSialException.java
 * Deskripsi : Ekspresi buatan sendiri, menolak masukan angka 13!
 * Pembuat   : Nadia Syifa Khairunnisa / 24060123120023
 * Tanggal   : 5 Maret 2025
 */
public class AngkaSialException extends Exception {
    public AngkaSialException (){
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}
