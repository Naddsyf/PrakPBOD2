/*
 * File : Persegi.java
 * Name : Nadia Syifa Khairunnisa
 * NIM  : 24060123120023
 * Date : 12 Mei 2025
 * Desc : Implementation of Persegi class
 */

/**
 *
 * @author Nadia
 */
public class Persegi extends BangunDatar {
    private double sisi;
    
    public Persegi(double sisi){
        this.sisi = sisi;
    }
    
    @Override
    public double hitungKeliling(){
        return 4*sisi;
    }
    @Override
    public double hitungLuas(){
        return sisi*sisi;
    }
}
