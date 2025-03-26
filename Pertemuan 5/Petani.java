/*
 * File : Petani.java
 * Name : Nadia Syifa Khairunnisa
 * Date : 26 March 2025
 * Desc : Implementation of Petani class
 */
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;

    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan,String asal_kota){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public String getAsalKota(){
        return asal_kota;
    }

    public static int getCounterPetani(){
        return counterPetani;
    }

    public void setAsalKota(String asal_kota){
        this.asal_kota = asal_kota;
    }

    @Override
    public int hitungMasaKerja(){
        return (int) ChronoUnit.YEARS.between(getMulaiKerja(), LocalDate.now()) + 0;
    }

    @Override
    public double hitungPajak(){
        return 0;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println(">Asal Kota       : " + getAsalKota());
        System.out.println(">Pajak           : " + hitungPajak());
    }
}
