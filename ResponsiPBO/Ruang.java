public class Ruang{
    private String kode;
    private double panjang, lebar, tinggi;
    private int kapasitas;

    public Ruang(){
        kode = " ";
        panjang = 0.0;
        lebar = 0.0;
        tinggi = 0.0;
        kapasitas = 0;
    }

    public Ruang(String kode, double panjang, double lebar, double tinggi, int kapasitas){
        this.kode = kode;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.kapasitas = kapasitas;
    }

    public String getKode(){
        return kode;
    }

    public double getPanjang(){
        return panjang;
    }

    public double getLebar(){
        return lebar;
    }

    public double getTinggi(){
        return tinggi;
    }

    public int getKapasitas(){
        return kapasitas;
    }

    public void setKode(String kode){
        this.kode = kode;
    }

    public void setPanjang(double panjang){
        this.panjang = panjang;
    }

    public void setLebar(double lebar){
        this.lebar = lebar;
    }

    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    public void setKapasitas(int kapasitas){
        this.kapasitas = kapasitas;
    }

    public double hitungBiayaKebersihan(double tarif){
        return panjang * lebar * tarif;
    }

    public void getInfoRuang(){
        System.out.println("Kode : " + getKode());
        System.out.println("Panjang : " + getPanjang());
        System.out.println("Lebar : " + getLebar());
        System.out.println("Tinggi : " + getTinggi());
        System.out.println("Kapasitas : " + getKapasitas());
    }

}