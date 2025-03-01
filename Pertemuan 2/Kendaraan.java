/* Nama File : Kendaraan.java
 * Deskripsi : berisi atribut dan method dalam class Kendaraan
 * Pembuat   : Nadia Syifa Khairunnisa / 24060123120023
 * Tanggal   : 26 Februari 2025
 */
public class Kendaraan {
    /* ===== Atribut ===== */
    private String noPlat,jenis;

    /* ===== Method ===== */
    //Konstruktor
    public Kendaraan(){
        this.noPlat = "";
        this.jenis = "";
    }

    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    //Getter dan Setter
    public String getNoPlat(){
        return noPlat;
    }

    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public String getJenis(){
        return jenis;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }
}
