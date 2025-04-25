public class ruangKelas extends Ruang {
    private int jmlKursiTersedia;
    private int jmlKursiRusak;

    public ruangKelas(){
        super();
        jmlKursiTersedia = 0;
        jmlKursiRusak = 0;
    }
    public ruangKelas(String kode, double panjang, double lebar, double tinggi, int kapasitas, int jmlKursiTersedia, int jmlKursiRusak){
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.jmlKursiTersedia = jmlKursiTersedia;
        this.jmlKursiRusak = jmlKursiRusak;
    }

    public int getJmlhKursiTersedia(){
        return jmlKursiTersedia;
    }

    public int getJmlKursiRusak(){
        return jmlKursiRusak;
    }

    public void setJmlKursiTersedia(int jmlKursiTersedia){
        this.jmlKursiTersedia = jmlKursiTersedia;
    }

    public void setJmlKursiRusak(int jmlKursiRusak){
        this.jmlKursiRusak = jmlKursiRusak;
    }

    @Override
    public void getInfoRuang(){
        super.getInfoRuang();
        System.out.println("Jml Kursi Tersedia : " + getJmlhKursiTersedia());
        System.out.println("Jml Kursi rusak : " + getJmlKursiRusak());

    }
}
