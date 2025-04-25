public class ruangDepartemen extends Ruang {
    private Departemen departemen;
    private int jumlahMeja;
    private int jumlahKursi;
    private int jumlahLemari;

    public ruangDepartemen() {
        super();
        this.departemen = new Departemen(" ", " ", 0.0);
        this.jumlahMeja = 0;
        this.jumlahKursi = 0;
        this.jumlahLemari = 0;
    }
    

    public ruangDepartemen(String kode, double panjang, double lebar, double tinggi, int kapasitas, Departemen departemen, int jumlahMeja, int jumlahKursi, int jumlahLemari) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.departemen = departemen;
        this.jumlahMeja = jumlahMeja;
        this.jumlahKursi = jumlahKursi;
        this.jumlahLemari = jumlahLemari;
}


    public Departemen getDepartemen(){
        return departemen;
    }

    public int getJmlMeja(){
        return jumlahMeja;
    }

    public int getJmlKursi(){
        return jumlahKursi;
    }

    public int getJmlLemari(){
        return jumlahLemari;
    }

    public void setMeja(int jumlahMeja){
        this.jumlahMeja = jumlahMeja;
    }

    public void setDepartemen(Departemen departemen) {
        this.departemen = departemen;
    }

    public void setKursi(int jumlahkursi){
        this.jumlahKursi = jumlahkursi;
    }

    public void setLemari(int jumlahLemari){
        this.jumlahLemari = jumlahLemari;
    }

    @Override
    public double hitungBiayaKebersihan(double tarif) {
        return super.hitungBiayaKebersihan(departemen.getTarif());
}


    @Override
    public void getInfoRuang() {
        super.getInfoRuang();
        System.out.println("Departemen: " + departemen.getNama());
        System.out.println("Ketua Departemen: " + departemen.getKetua());
        System.out.println("Jumlah Meja: " + jumlahMeja);
        System.out.println("Jumlah Kursi: " + jumlahKursi);
        System.out.println("Jumlah Lemari: " + jumlahLemari);
        System.out.println("Biaya Kebersihan: " + hitungBiayaKebersihan(departemen.getTarif()));
}

}
