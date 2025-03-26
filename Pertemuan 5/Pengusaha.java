/*
 * File : Pengusaha.java
 * Name : Nadia Syifa Khairunnisa
 * Date : 26 March 2025
 * Desc : Implementation of Pengusaha class
 */
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan,String npwp){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNpwp(){
        return npwp;
    }

    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    public void setNpwp(String npwp){
        this.npwp = npwp;
    }

    @Override
    public int hitungMasaKerja(){
        return (int) ChronoUnit.YEARS.between(getMulaiKerja(), LocalDate.now()) + 2;
    }

    @Override
    public double hitungPajak(){
        return 0.15 * getPendapatan();
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println(">NPWP            : " + getNpwp());
        System.out.println(">Pajak           : " + hitungPajak());
    }
}
