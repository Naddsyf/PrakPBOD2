/*
 * File : PersegiPanjang.java
 * Name : Nadia Syifa Khairunnisa
 * NIM  : 24060123120023
 * Date : 12 Mei 2025
 * Desc : Implementation of PersegiPanjang class
 */

/**
 *
 * @author Nadia
 */
public class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;
    
    public PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public double hitungKeliling(){
        return 2*(panjang+lebar);
    }
    @Override
    public double hitungLuas(){
        return panjang*lebar;
    }
}
