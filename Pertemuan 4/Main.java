/*
 * File : Main.java
 * Name : Nadia Syifa Khairunnisa
 * Date : 18 Maret 2025
 * Desc : Implementation of Main class
 */
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        DosenTetap dTTP1, dTTP2, dTTP3;
        DosenTamu dTM1, dTM2, dTM3;
        Tendik T1, T2, T3;

        dTTP1 = new DosenTetap("9545647548", "Andi", LocalDate.of(1990,5,5), LocalDate.of(2015,1,1), 5000000, "Fakultas Sains dan Matematika", "78647324");
        dTTP2 = new DosenTetap("1234567890", "Lala", LocalDate.of(1992,3,19), LocalDate.of(2019,8,7), 5000000, "Fakultas Kedokteran", "95837015");
        dTTP3 = new DosenTetap("7644902735", "Mila", LocalDate.of(1988,9,11), LocalDate.of(2014,9,3), 6000000, "Fakultas Teknik", "66923501 ");

        dTM1 = new DosenTamu("3782950188", "Diah", LocalDate.of(1993,7,9), LocalDate.of(2016,4,3), 3000000, "Fakultas Kesehatan Masyarakat", "77489305", LocalDate.of(2016,11,4));
        dTM2 = new DosenTamu("7840289479", "Lita", LocalDate.of(1993,11,21), LocalDate.of(2017,6,10), 3500000, "Fakultas Psikologi", "92098594", LocalDate.of(2018,1,5));
        dTM3 = new DosenTamu("2289044293", "Asep", LocalDate.of(1992,4,27), LocalDate.of(2016,2,15), 3000000, "Fakultas Ekonomika dan Bisnis", "56739201", LocalDate.of(2016,9,3));
        
        T1 = new Tendik("48925693", "Doni", LocalDate.of(1993,2,14), LocalDate.of(2015,7,19), 2800000, "Kemahasiswaan");
        T2 = new Tendik("38570145", "Asri", LocalDate.of(1994,8,2), LocalDate.of(2018,6,14), 2500000, "Akademik, ");
        T3 = new Tendik("85028492", "Bambang", LocalDate.of(1993,12,7), LocalDate.of(2016,4,22), 2500000, "Sumber Daya");

        System.out.println("===== Informasi Dosen Tetap =====\n");
        System.out.println("> Print Info dTTP1");
        dTTP1.printInfo();
        System.out.println("\n> Print Info dTTP2");
        dTTP2.printInfo();
        System.out.println("\n> Print Info dTTP3");
        dTTP3.printInfo();

        System.out.println("\n===== Informasi Dosen Tamu =====\n");
        System.out.println("> Print Info dTM1");
        dTM1.printInfo();
        System.out.println("\n> Print Info dTM2");
        dTM2.printInfo();
        System.out.println("\n> Print Info dTM3");
        dTM3.printInfo();

        System.out.println("\n===== Informasi Tendik =====\n");
        System.out.println("> Print Info T1");
        T1.printInfo();
        System.out.println("\n> Print Info T2");
        T2.printInfo();
        System.out.println("\n> Print Info T3");
        T3.printInfo();
    }
}
