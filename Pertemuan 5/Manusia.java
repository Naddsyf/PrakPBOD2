/*
 * File : Manusia.java
 * Name : Nadia Syifa Khairunnisa
 * Date : 25 March 2025
 * Desc : Implementation of Manusia class
 */
import java.time.LocalDate;

public abstract class Manusia{
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    protected Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan){
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns ++;
    }

    public String getNama(){
        return nama;
    }

    public LocalDate getMulaiKerja(){
        return tgl_mulai_kerja;
    }

    public String getAlamat(){
        return alamat;
    }

    public double getPendapatan(){
        return pendapatan;
    }

    public static int getCounterMns(){
        return counterMns;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setMulaiKerja(LocalDate tgl_mulai_kerja){
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }

    public abstract int hitungMasaKerja();

    public void cetakInfo(){
        System.out.println(">Nama            : "+ getNama());
        System.out.println(">Tgl Mulai kerja : " + getMulaiKerja());
        System.out.println(">Alamat          : " + getAlamat());
        System.out.println(">Pendapatan      : " + (long) getPendapatan());
        System.out.println(">Masa Kerja      : " + hitungMasaKerja() + " tahun");
    }

}