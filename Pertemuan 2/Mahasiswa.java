/* Nama File : Mahasiswa.java
 * Deskripsi : berisi atribut dan method dalam class Mahasiswa
 * Pembuat   : Nadia Syifa Khairunnisa / 24060123120023
 * Tanggal   : 27 Februari 2025
 */
import java.util.ArrayList;

public class Mahasiswa {
    /* ===== Atribut ===== */
    private String nim,nama,prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /* ===== Method ===== */
    public Mahasiswa(){
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatkul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan =new Kendaraan();
    }

    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    //Getter dan Setter
    public String getNim(){
        return nim;
    }

    public void setNim(String nim){
        this.nim = nim;
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

    public ArrayList<MataKuliah> getListMatkul(){
        return listMatkul;
    }

    public void setListMatkul(ArrayList<MataKuliah> listMatkul){
        this.listMatkul = listMatkul;
    }

    public Dosen getDosenWali(){
        return dosenWali;
    }

    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan ; 
    }

    //Nambah Matkul
    public void addMatkul(MataKuliah newMatkul){
        listMatkul.add(newMatkul);
    }

    //Jumlah SKS Matkul
    public int getJumlahSKS(){
        int totalSKS = 0;
        int i;
        for (i=0; i<listMatkul.size();i++){
            totalSKS += listMatkul.get(i).getSKS();
        }
        return totalSKS;
    }

    //Jumlah Matkul 
    public int getJumlahMatkul(){
        return listMatkul.size();
    }

    //Menampilkan data mahasiswa
    public void printMhs(){
        System.out.println("> NIM : " + nim);
        System.out.println("> Nama : " + nama);
        System.out.println("> Prodi : " + prodi);
    }

    //Menampilkan data mahasiswa secara detail
    public void printDetailMhs(){
        System.out.println("\nData Mahasiswa : ");
        printMhs();

        System.out.println("\nDaftar Matkul : ");
        if(listMatkul.isEmpty()){
            System.out.println("Belum ada matkul yang diambil");
        }
        else{
            int i;
            for(i=0;i<listMatkul.size();i++){
                System.out.println("> " + listMatkul.get(i).getNama() + " (" + listMatkul.get(i).getSKS() + ")");
            }
        }
    
        System.out.println("\nDosen Wali : ");
        System.out.println("> NIP : " + dosenWali.getNip());
        System.out.println("> Nama : " + dosenWali.getNama());
        System.out.println("> Prodi : " + dosenWali.getProdi());
    
        System.out.println("\nKendaraan : ");
        if(kendaraan == null){
            System.out.println("Belum punya kendaraan");
        }
        else{
            System.out.println("> Jenis Kendaraan : " + kendaraan.getJenis());
            System.out.println("> No Plat : " + kendaraan.getNoPlat());
        }
    }
}
