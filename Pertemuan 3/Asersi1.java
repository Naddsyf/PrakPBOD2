/* Nama File : Asersi1.java
 * Deskripsi : Program untuk menunjukkan asersi
 * Pembuat   : Nadia Syifa Khairunnisa / 24060123120023
 * Tanggal   : 5 Maret 2025
 */
public class Asersi1{
    public static void main(String[] args) {
        int x=-5;
        if(x>0){
            System.out.println("x bilangan positif");
        }else{
            assert(x<0):"ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}
