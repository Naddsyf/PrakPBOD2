/* Nama File : Asersi2.java
 * Deskripsi : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
 * Pembuat   : Nadia Syifa Khairunnisa / 24060123120023
 * Tanggal   : 5 Maret 2025
 */
//class Lingkaran
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari>0):"jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

/*Secara konsep, ada yang kurang tepat pada program Asersi2 di atas : 
1. Asersi tidak selalu aktif jika program tidak dijalankan dengan -ea. 
   Pada program Asersi di atas jika kita tidak mengaktifkan asersi dengan -ea maka program asersi akan diabaikan
   sehingga program tetap bisa membuat objek lingkaran dengan jariJari = 0 tanpa eror
2. Program ini tidak memiliki validasi selain asersi, sehingga tidak aman
   Karena Asersi bisa dinonaktifkan, program akan lebih aman kalau ada validasi lain melalui pengecekan if-else
   baik pada main ataupun pada konstruktor lingkaran.
*/
