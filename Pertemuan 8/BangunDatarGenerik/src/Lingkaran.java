/*
 * File : Lingkaran.java
 * Name : Nadia Syifa Khairunnisa
 * NIM  : 24060123120023
 * Date : 12 Mei 2025
 * Desc : Implementation of Lingkaran class
 */
/**
 *
 * @author Nadia
 */
public class Lingkaran extends BangunDatar{
    private double jejari;
    
    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    
    @Override
    public double hitungKeliling(){
        return 2*jejari*3.14;
    }
    @Override
    public double hitungLuas(){
        return 3.14 * jejari * jejari;
    }
}
