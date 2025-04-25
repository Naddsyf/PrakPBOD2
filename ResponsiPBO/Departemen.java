public class Departemen {
    private String nama;
    private String ketua;
    private double tarifKebersihan;

    public Departemen(){
        nama = " ";
        ketua = " ";
        tarifKebersihan = 0.0;
    }

    public Departemen(String nama, String ketua, double tarifKebersihan) {
        this.nama = nama;
        this.ketua = ketua;
        this.tarifKebersihan = tarifKebersihan;
    }

    public String getNama(){
        return nama;
    }

    public String getKetua(){
        return ketua;
    }

    public double getTarif(){
        return tarifKebersihan;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setKetua(String ketua){
        this.ketua = ketua;
    }

    public void setTarif(double tarifKebersihan){
        this.tarifKebersihan = tarifKebersihan;
    }

}
