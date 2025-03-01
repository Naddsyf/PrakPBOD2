/* Nama File : Dosen.java
 * Deskripsi : berisi atribut dan method dalam class Dosen
 * Pembuat   : Nadia Syifa Khairunnisa / 24060123120023
 * Tanggal   : 26 Februari 2025
 */
public class Dosen {
    /* ===== Atribut ===== */
    private String nip,nama,prodi;

    /* ===== Method ===== */
    //Konstruktor
    public Dosen(){
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    //Getter dan Setter
    public String getNip(){
        return nip;
    }

    public void setNip(String nip){
        this.nip = nip; 
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    public String getProdi(){
        return prodi;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }
}
