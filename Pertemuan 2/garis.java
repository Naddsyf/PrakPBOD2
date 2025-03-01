/* Nama File : garis.java
 * Deskripsi : berisi atribut dan method dalam class garis
 * Pembuat   : Nadia Syifa Khairunnisa / 24060123120023
 * Tanggal   : 26 Februari 2025
 */
public class garis {
    /* ======= atribut ======= */
    private titik titikAwal, titikAkhir;
    private static int counterGaris = 0;

    /* ======== method ======= */

    //a. konstruktor tanpa parameter
    public garis(){
        titikAwal = new titik(0,0);
        titikAkhir = new titik(1,1);
        counterGaris++;
    }

    //b. konstruktor dengan parameter
    public garis(titik titikAwal,titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    //c. getter dan setter
    public titik getTitikAwal(){
        return titikAwal;
    }

    public titik getTitikAkhir(){
        return titikAkhir;
    }

    public void setTitikAwal(titik titikAwal){
        this.titikAwal = titikAwal;
    }

    public void setTitikAkhir(titik titikAkhir){
        this.titikAkhir = titikAkhir;
    }

    //getter counterGaris
    public static int getCounterGaris(){
        return counterGaris;
    }

    //d. panjang garis
    public double panjangGaris(){
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis(); //selisih absis 
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat(); //selisih ordinat
        return Math.sqrt((dx * dx) + (dy * dy));
    }

    //e. gradien garis
    public double gradienGaris(){
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis(); //selisih absis
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat(); //selisih ordinat
        return dy / dx ;
    }

    //f. titik tengah garis
    public titik tengahGaris(){
        double tengahX = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2; 
        double tengahY = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new titik(tengahX,tengahY);
    }

    //g. sejajar
    public boolean isSejajar(garis G2){
        double gradien1 = this.gradienGaris();
        double gradien2 = G2.gradienGaris();
        return gradien1 == gradien2;
    }

    //h. tegak lurus
    public boolean isTegakLurus(garis G2){
        double gradien1 = this.gradienGaris();
        double gradien2 = G2.gradienGaris();
        return gradien1 * gradien2 == -1;
    }

    //i. print garis
    public void printGaris(){
        System.out.println("Titik Awal : (" + titikAwal.getAbsis() + " , " + titikAwal.getOrdinat() + ")");
        System.out.println("Titik Akhir : (" + titikAkhir.getAbsis() + " , " + titikAkhir.getOrdinat() + ")");
    }

    //j. nampilin persamaan garis
    public String persamanGaris(){
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
