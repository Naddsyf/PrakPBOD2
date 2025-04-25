public class laboratoriumKomputer extends ruangLaboratorium{
    private int jmlKomp;

    public laboratoriumKomputer(){
        super();
        jmlKomp = 0;
    }

    public laboratoriumKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas, String nama, double hargaSewa, int jmlKomp){
        super(kode, panjang, lebar, tinggi, kapasitas, nama, hargaSewa);
        this.jmlKomp = jmlKomp;
    }
    public int getJmlKomp(){
        return jmlKomp;
    }

    public void setJmlKompu(int jmlKomp){
        this.jmlKomp = jmlKomp;
    }

    @Override
    public void getInfoRuang(){
        super.getInfoRuang();
        System.out.println("Jml Komp : " + getJmlKomp());
    }
}
