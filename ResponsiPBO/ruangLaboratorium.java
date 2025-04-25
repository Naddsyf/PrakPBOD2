public class ruangLaboratorium extends Ruang {
    private String nama;
    private double hargaSewa;

    public ruangLaboratorium(){
        super();
        nama = " ";
        hargaSewa = 0.0;
    }

    public ruangLaboratorium(String kode, double panjang, double lebar, double tinggi, int kapasitas, String nama, double hargaSewa){
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.nama = nama;
        this.hargaSewa = hargaSewa;
    }

    public String getNama(){
        return nama;
    }

    public double getHargaSewa(){
        return hargaSewa;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setHargaSewa(double hargaSewa){
        this.hargaSewa = hargaSewa;
    }

    @Override
    public void getInfoRuang(){
        super.getInfoRuang();
        System.out.println("Nama Lab : " + getNama());
        System.out.println("Harga Sewa : " + getHargaSewa());
    }

}
