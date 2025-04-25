import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Departemen departemenTI = new Departemen("Teknik Informatika", "Dr. John Doe", 5000);
        
        System.out.println("========== RUANG KELAS ==========");
        ruangKelas kelasA101 = new ruangKelas("A101", 10, 8, 3, 30, 25, 2);
        kelasA101.getInfoRuang();
        
        System.out.println("\n========== RUANG LABORATORIUM KOMPUTER ==========");
        laboratoriumKomputer labKomputer = new laboratoriumKomputer("LK01", 12, 10, 3, 20, "Lab Komputer Dasar", 1000000, 25);
        labKomputer.getInfoRuang();
        
        System.out.println("\n========== RUANG LABORATORIUM NON-KOMPUTER ==========");
        List<String> matkulLabKimia = Arrays.asList("Kimia Dasar", "Biokimia", "Analisis Kimia");
        laboratoriumNonKomputer labKimia = new laboratoriumNonKomputer("LNK01", 15, 12, 4, 15, "Lab Kimia", 1500000, matkulLabKimia);
        labKimia.tambahMataKuliah("Kimia Organik");
        labKimia.getInfoRuang();
        
        System.out.println("\n========== RUANG DEPARTEMEN TI ==========");
        ruangDepartemen ruangDeptTI = new ruangDepartemen("DTI01", 8, 6, 3, 10, departemenTI, 5, 10, 3);
        ruangDeptTI.getInfoRuang();
        
        System.out.println("\n========== RUANG DOSEN TI ==========");
        ruangDosen ruangDosen1 = new ruangDosen("DR01", 6, 5, 3, 2, departemenTI, "Dr. Ahmad", 2, 1);
        ruangDosen1.getInfoRuang();
        
        Departemen departemenSI = new Departemen("Sistem Informasi", "Dr. Jane Smith", 4500);
        
        System.out.println("\n========== RUANG DEPARTEMEN SI ==========");
        ruangDepartemen ruangDeptSI = new ruangDepartemen("DSI01", 7, 5, 3, 8, departemenSI, 4, 8, 2);
        ruangDeptSI.getInfoRuang();
        
        System.out.println("\n========== DEMO PERUBAHAN DATA ==========");
        System.out.println("-- Sebelum perubahan --");
        kelasA101.getInfoRuang();
        
        System.out.println("\n-- Setelah perubahan --");
        kelasA101.setPanjang(12);
        kelasA101.setLebar(9);
        kelasA101.setKapasitas(35);
        kelasA101.setJmlKursiTersedia(30);
        kelasA101.setJmlKursiRusak(3);
        kelasA101.getInfoRuang();
        
        System.out.println("\n========== PERHITUNGAN BIAYA KEBERSIHAN ==========");
        System.out.println("Biaya kebersihan ruang kelas A101: Rp" + kelasA101.hitungBiayaKebersihan(departemenTI.getTarif()));
        System.out.println("Biaya kebersihan lab komputer: Rp" + labKomputer.hitungBiayaKebersihan(departemenTI.getTarif()));
        System.out.println("Biaya kebersihan ruang departemen SI: Rp" + ruangDeptSI.hitungBiayaKebersihan(departemenSI.getTarif()));
    }
}