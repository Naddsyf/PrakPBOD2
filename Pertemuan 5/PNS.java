/*
 * File : PNS.java
 * Name : Nadia Syifa Khairunnisa
 * Date : 26 March 2025
 * Desc : Implementation of PNS class
 */
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class PNS extends Manusia implements Pajak{
    private String nip;
    private static int counterPNS = 0;

    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan,String nip){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNip(){
        return nip;
    }

    public static int getCounterPNS(){
        return counterPNS;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    @Override
    public int hitungMasaKerja(){
        return (int) ChronoUnit.YEARS.between(getMulaiKerja(), LocalDate.now()) + 3;
    }

    @Override
    public double hitungPajak(){
        return 0.15 * getPendapatan();
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println(">NIP             : " + getNip());
        System.out.println(">Pajak           : " + hitungPajak());
    }
}
