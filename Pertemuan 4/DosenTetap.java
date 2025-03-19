/*
 * File : DosenTetap.java
 * Name : Nadia Syifa Khairunnisa
 * Date : 17 Maret 2025
 * Desc : Implementation of DosenTetap class
 */
import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Dosen{
    final private String NIDN;
    final private static int BUP = 65;
    final private static double besarTunjangan = 0.02;

    public DosenTetap(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas, String NIDN){
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDN = NIDN;
    }

    public String getNIDN(){
        return NIDN;
    }

    public static int getBUP(){
        return BUP;
    }

    public static double getBesarTunjangan(){
        return besarTunjangan;
    }

    public double countTunjangan(){
        Period masaKerja = Period.between(getTMT(), LocalDate.now());
        return getBesarTunjangan() * getGajiPokok() * masaKerja.getYears();
    }


    public LocalDate getBatasPensiun(){
        return getTanggalLahir().plusYears(getBUP()).plusMonths(1).withDayOfMonth(1);
    }

    public void printInfo(){
        System.out.println("NIP              : " + getNIP());
        System.out.println("NIDN             : " + getNIDN());
        System.out.println("Nama             : " + getNama());
        System.out.println("Tanggal Lahir    : " + formatTanggal(getTanggalLahir()));
        System.out.println("TMT              : " + formatTanggal(getTMT()));
        System.out.println("Jabatan          : Dosen Tetap");
        System.out.println("Fakultas         : " + getFakultas());
        System.out.println("Masa Kerja       : " + getMasaKerja());
        System.out.println("BUP              : " + formatTanggal(getBatasPensiun()));
        System.out.println("Gaji Pokok       : " + formatDuit(getGajiPokok()));
        System.out.println("Tunjangan        : " + (getBesarTunjangan() * 100) + "% x " + Period.between(getTMT(), LocalDate.now()).getYears() + " x Rp " + formatDuit(getGajiPokok()) + " = " + formatDuit(countTunjangan()));
    }
}
