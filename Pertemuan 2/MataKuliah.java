/* Nama File : Matakuliah.java
 * Deskripsi : berisi atribut dan method dalam class MataKuliah
 * Pembuat   : Nadia Syifa Khairunnisa / 24060123120023
 * Tanggal   : 26 Februari 2025
 */
public class MataKuliah {
    /* ===== Atribut ===== */
    private String idMatkul,nama;
    private int sks; 

    /* ===== Method ===== */
    public MataKuliah(){
        this.idMatkul = "";
        this.nama = "";
        this.sks = 0;
    }

    public MataKuliah(String idMatkul, String nama, int sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    //Getter dan Setter
    public String getIdMatkul(){
        return idMatkul;
    }

    public void setIdMatkul(String idMatkul){
        this.idMatkul = idMatkul;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public int getSKS(){
        return sks;
    }

    public void setSKS(int sks){
        this.sks = sks;
    }

}
