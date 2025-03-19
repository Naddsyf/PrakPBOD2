/*
 * File : Tendik.java
 * Name : Nadia Syifa Khairunnisa
 * Date : 18 Maret 2025
 * Desc : Implementation of Tendik class
 */
import java.time.LocalDate;
import java.time.Period;
public class Tendik extends Pegawai {
    final private static int BUP = 55;
    final private static double tunjangan = 0.01;
    private String bidang;

    public Tendik(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String bidang){
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }

    public static int getBUP(){
        return BUP;
    }

    public static double getTunjangan(){
        return tunjangan;
    }

    public String getBidang(){
        return bidang;
    }

    public void setBidang(String bidang){
        this.bidang = bidang;
    }

    public double countTunjangan(){
        Period masaKerja = Period.between(getTMT(), LocalDate.now());
        return getTunjangan() * getGajiPokok() * masaKerja.getYears();
    }

    public LocalDate getBatasPensiun(){
        return getTanggalLahir().plusYears(getBUP()).plusMonths(1).withDayOfMonth(1);
    }

    public void printInfo(){
        System.out.println("NIP              : " + getNIP());
        System.out.println("Nama             : " + getNama());
        System.out.println("Tanggal Lahir    : " + formatTanggal(getTanggalLahir()));
        System.out.println("TMT              : " + formatTanggal(getTMT()));
        System.out.println("Jabatan          : Tendik");
        System.out.println("Bidang           : " + getBidang());
        System.out.println("Masa Kerja       : " + getMasaKerja());
        System.out.println("BUP              : " + formatTanggal(getBatasPensiun()));
        System.out.println("Gaji Pokok       : " + formatDuit(getGajiPokok()));
        System.out.println("Tunjangan        : " + (getTunjangan() * 100) + "% x " + " x " + formatDuit(getGajiPokok()) + " = " + formatDuit(countTunjangan()));
    }

}
