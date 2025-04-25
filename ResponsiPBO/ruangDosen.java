public class ruangDosen extends Ruang {
    private Departemen departemen;
    private String namaDosen;
    private int jumlahKursi;
    private int jumlahMeja;

    public ruangDosen() {
        super();
        this.departemen = new Departemen(" ", " ", 0.0);
        this.namaDosen = " ";
        this.jumlahKursi = 0;
        this.jumlahKursi = 0;
    }
    public ruangDosen(String kode, double panjang, double lebar, double tinggi, int kapasitas, Departemen departemen, String namaDosen, int jumlahKursi, int jumlahMeja) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.departemen = departemen;
        this.namaDosen = namaDosen;
        this.jumlahKursi = 0;
        this.jumlahMeja = 0;
    }

    public Departemen getDepartemen(){
        return departemen;
    }

    public String getNamaDosen(){
        return namaDosen;
    }
    public int getJmlMeja(){
        return jumlahMeja;
    }

    public int getJmlKursi(){
        return jumlahKursi;
    }

    public void setDepartemen(Departemen departemen) {
        this.departemen = departemen;
    }

    public void setKursi(int jumlahkursi){
        this.jumlahKursi = jumlahkursi;
    }

    public void setMeja(int jumlahMeja){
        this.jumlahMeja = jumlahMeja;
    }

    public void setNamaDosen(String namaDosen){
        this.namaDosen = namaDosen;
    }

    @Override
    public void getInfoRuang() {
        super.getInfoRuang();
        System.out.println("Nama Dosen: " + namaDosen);
        System.out.println("Departemen: " + departemen.getNama());
        System.out.println("Ketua Departemen: " + departemen.getKetua());
        System.out.println("Jumlah Meja : " + getJmlMeja());
        System.out.println("Jumlah Kursi : " + getJmlKursi());
        System.out.println("Biaya Kebersihan: " + hitungBiayaKebersihan(departemen.getTarif()));
    }


}
