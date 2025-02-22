/* Nama File : titik.java
 * Deskripsi : berisi atribut dan method dalam class titik
 * Pembuat   : Nadia Syifa Khairunnisa / 24060123120023
 * Tanggal   : 19 Februari 2025
 */
public class titik {
    double absis,ordinat; //atribut
    static int counterTitik = 0;

    //konstrutor
    titik(){
        absis=0;
        ordinat=0;
        counterTitik++;
    }

    //overloading 
    titik(double x, double y){
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    void setAbsis(double x){
        absis=x;
    }

    void setOrdinat(double y){
        ordinat=y;
    }

    void geser(double x, double y){
        absis=absis+x;
        ordinat=ordinat+x;
    }

    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    static int getcounterTitik(){
        return counterTitik;
    }

    int getKuadran(){
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

    double getJarakPusat(){
        return Math.sqrt((absis*absis) + (ordinat*ordinat));
    }

    double getJarak(titik T){
        return Math.sqrt(((T.absis-absis)*(T.absis-absis)) + (T.ordinat-ordinat)*(T.ordinat-ordinat));
    }

    void refleksiX(){
        this.ordinat = ordinat * -1;
    }

    void refleksiY(){
        this.absis = absis * -1;
    }

    titik getRefleksiX(){
        titik T3 = new titik(absis,ordinat * -1);
        return T3;
    }

    titik getRefleksiY(){
        titik T3 = new titik(absis * -1 ,ordinat);
        return T3;
    }
}

