/* Nama File :  AngkaSial.java
 * Deskripsi :  Program penggunaan exception buatan sendiri 
 *              Pengenalan klausa 'throw' dan throws
 * Pembuat   :  Nadia Syifa Khairunnisa / 24060123120023
 * Tanggal   :  8 Maret 2025
 */
public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
    
}

/* Pertanyaan dan jawaban : 
    1.  Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi? 
        Jawab : Jika eksepsi terjadi (yaitu angka == 13) baris 12 tidak akan dieksekusi. Program akan 
        langsung melempar eksepsi dengan throw new AngkaSialException(). Karena eksepsi dilempar sebelum 
        mencapai baris 12, maka baris tersebut tidak dijalankan. 
        Namun jika angka bukan 13(misalnya 10 atau 12), baris 12 tetap akan dieksekusi karena tidak ada eksepsi
        yang dilempar.
    
    2.  Apakah baris 21 pada AngkaSial.java di atas dieksekusi?  
        Jawab : Iya, baris 21 tetap dieksekusi jik eksepsi terjadi. Ketika cobaAngka(13) melempar eksepsi, eksekusi
        akan langsung melompat ke blok catch, sehingga baris 21 akan dijalankan untuk menampilkan pesan dari eksepsi.
 */
