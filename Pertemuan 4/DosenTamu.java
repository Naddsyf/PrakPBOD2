/*
 * File : DosenTamu.java
 * Name : Nadia Syifa Khairunnisa
 * Date : 18 Maret 2025
 * Desc : Implementation of DosenTamu class
 */
import java.time.LocalDate;

public class DosenTamu extends Dosen{
    final private String NIDK;
    private LocalDate akhirKontrak;
    final private static double tunjangan = 0.025;

    public DosenTamu(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas, String NIDK, LocalDate akhirKontrak){
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.akhirKontrak = akhirKontrak;
    }

    public String getNIDK(){
        return NIDK;
    }

    public LocalDate getAkhirKontrak(){
        return akhirKontrak;
    }

    public static double getTunjangan(){
        return tunjangan;
    }

    public void setAkhirKontrak(LocalDate akhirKontrak){
        this.akhirKontrak = akhirKontrak;
    }

    public double countTunjangan(){
        return tunjangan * getGajiPokok();
    }

      public void printInfo(){
        System.out.println("NIP             : " + getNIP());
        System.out.println("NIDK            : " + getNIDK());
        System.out.println("Nama            : " + getNama());
        System.out.println("Tanggal Lahir   : " + formatTanggal(getTanggalLahir()));
        System.out.println("TMT             : " + formatTanggal(getTMT()));
        System.out.println("Jabatan         : Dosen Tamu");
        System.out.println("Fakultas        : " + getFakultas());
        System.out.println("Masa Kerja      : " + getMasaKerja());
        System.out.println("Gaji Pokok      : " + formatDuit(getGajiPokok()));
        System.out.println("Tunjangan       : " + (getTunjangan() * 100) + " % x " + formatDuit(getGajiPokok()) + " = " + formatDuit(countTunjangan()));
        System.out.println("Akhir Kontrak   : " + formatTanggal(getAkhirKontrak()));
    }
}
