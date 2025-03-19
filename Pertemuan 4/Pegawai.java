/*
 * File : Pegawai.java
 * Name : Nadia Syifa Khairunnisa
 * Date : 17 Maret 2025
 * Desc : Implementation of Pegawai class
 */
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.text.NumberFormat;

public class Pegawai {
    final private String NIP;
    private String nama;
    final private LocalDate tanggalLahir, TMT;
    private double gajiPokok;

    public Pegawai(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok){
        this.NIP = NIP;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    public String getNIP(){
        return NIP;
    }

    public String getNama(){
        return nama;
    }

    public LocalDate getTanggalLahir(){
        return tanggalLahir;
    }

    public LocalDate getTMT(){
        return TMT;
    }

    public double getGajiPokok(){
        return gajiPokok;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    public String getMasaKerja(){
        Period lama = Period.between(TMT,LocalDate.now());
        return lama.getYears() + " tahun " + lama.getMonths() + " bulan";
    }

    public String formatTanggal(LocalDate tgl){
        return tgl.format(DateTimeFormatter.ofPattern("d MMMM yyyy",new Locale("id", "ID")));
    }

    public String formatDuit(double duit) {
        NumberFormat formatter = NumberFormat.getInstance(new Locale("id", "ID"));
        formatter.setMinimumFractionDigits(2);
        return "Rp " + formatter.format(duit);
    }
}
