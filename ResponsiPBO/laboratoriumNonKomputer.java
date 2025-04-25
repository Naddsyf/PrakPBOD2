import java.util.ArrayList;
import java.util.List;
public class laboratoriumNonKomputer extends ruangLaboratorium{
    ArrayList<String> mataKuliah;

    public laboratoriumNonKomputer(){
        super();
        this.mataKuliah = new ArrayList<>();
    }

    public laboratoriumNonKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas, String nama, double hargaSewa, List<String> mataKuliah){
        super(kode, panjang, lebar, tinggi, kapasitas, nama, hargaSewa);
        this.mataKuliah = new ArrayList<>(mataKuliah);
    }

    public void tambahMataKuliah(String matkul) {
        mataKuliah.add(matkul);
    }

    public void tampilkanMataKuliah() {
        System.out.println("Mata Kuliah yang menggunakan lab ini:");
        for (String matkul : mataKuliah) {
            System.out.println("- " + matkul);
        }
    }

    @Override
    public void getInfoRuang() {
        super.getInfoRuang();
        tampilkanMataKuliah();
    }

}
