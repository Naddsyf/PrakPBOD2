/* Nama File : garis.java
 * Deskripsi : berisi atribut dan method dalam class garis
 * Pembuat   : Nadia Syifa Khairunnisa / 24060123120023
 * Tanggal   : 20 Februari 2025
 */
public class garis {
    /* ======= atribut ======= */
    titik titikAwal, titikAkhir;
    static int counterGaris = 0;

    /* ======== method ======= */

    //a. konstruktor tanpa parameter
    garis(){
        titikAwal = new titik(0,0);
        titikAkhir = new titik(1,1);
        counterGaris++;
    }

    //b. konstruktor dengan parameter
    garis(titik titikAwal,titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    //c. getter dan setter
    titik getTitikAwal(){
        return titikAwal;
    }

    void setTitikAwal(titik titikAwal){
        this.titikAwal = titikAwal;
    }

    titik getTitikAkhir(){
        return titikAkhir;
    }

    void setTitikAkhir(titik titikAkhir){
        this.titikAkhir = titikAkhir;
    }

    //getter counterGaris
    static int getCounterGaris(){
        return counterGaris;
    }

    //d. panjang garis
    double panjangGaris(){
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis(); //selisih absis 
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat(); //selisih ordinat
        return Math.sqrt((dx * dx) + (dy * dy));
    }

    //e. gradien garis
    double gradienGaris(){
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis(); //selisih absis
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat(); //selisih ordinat
        return dy / dx ;
    }

    //f. titik tengah garis
    titik tengahGaris(){
        double tengahX = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2; 
        double tengahY = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new titik(tengahX,tengahY);
    }

    //g. sejajar
    boolean isSejajar(garis G2){
        double gradien1 = this.gradienGaris();
        double gradien2 = G2.gradienGaris();
        return gradien1 == gradien2;
    }

    //h. tegak lurus
    boolean isTegakLurus(garis G2){
        double gradien1 = this.gradienGaris();
        double gradien2 = G2.gradienGaris();
        return gradien1 * gradien2 == -1;
    }

    //i. print garis
    void printGaris(){
        System.out.println("Titik Awal : (" + titikAwal.getAbsis() + " , " + titikAwal.getOrdinat() + ")");
        System.out.println("Titik Akhir : (" + titikAkhir.getAbsis() + " , " + titikAkhir.getOrdinat() + ")");
    }

    //j. nampilin persamaan garis
    String persamanGaris(){
        double m = this.gradienGaris();
        double c = titikAwal.getOrdinat() - (m * titikAwal.getAbsis());
        if (c < 0) {
            return "y = " + m + "x - " + Math.abs(c);
        }
        else {
            return "y = " + m + "x + " + c;
        }
        
    }

}
