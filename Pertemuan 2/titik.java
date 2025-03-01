/* Nama File : titik.java
 * Deskripsi : berisi atribut dan method dalam class titik
 * Pembuat   : Nadia Syifa Khairunnisa / 24060123120023
 * Tanggal   : 26 Februari 2025
 */
public class titik {
    /* ===== Atribut ===== */
    private double absis,ordinat; 
    private static int counterTitik = 0;

    /* ===== Method ===== */
    //konstrutor
    public titik(){
        absis=0;
        ordinat=0;
        counterTitik++;
    }

    //overloading konstruktor
    public titik(double x, double y){
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

    //Getter
    public double getAbsis(){
        return absis;
    }

    public double getOrdinat(){
        return ordinat;
    }

    //Setter
    public void setAbsis(double x){
        absis=x;
    }

    public void setOrdinat(double y){
        ordinat=y;
    }

    public void geser(double x, double y){
        absis=absis+x;
        ordinat=ordinat+x;
    }

    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    public static int getcounterTitik(){
        return counterTitik;
    }

    public int getKuadran(){
        if (absis > 0 && ordinat > 0) {
            return 1;
        }
        else if (absis < 0 && ordinat > 0){
            return 2;
        }
        else if (absis <0 && ordinat < 0){
            return 3;
        }
        else if (absis > 0 && ordinat < 0) {
            return 4;
        }
        else {
            return 0;
        }
    }

    public double getJarakPusat(){
        return Math.sqrt((absis*absis) + (ordinat*ordinat));
    }

    public double getJarak(titik T){
        return Math.sqrt(((T.absis-absis)*(T.absis-absis)) + (T.ordinat-ordinat)*(T.ordinat-ordinat));
    }

    public void refleksiX(){
        this.ordinat = ordinat * -1;
    }

    public void refleksiY(){
        this.absis = absis * -1;
    }

    public titik getRefleksiX(){
        titik T3 = new titik(absis,ordinat * -1);
        return T3;
    }

    public titik getRefleksiY(){
        titik T3 = new titik(absis * -1 ,ordinat);
        return T3;
    }
}

