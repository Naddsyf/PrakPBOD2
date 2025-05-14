/*
 * File : Segitiga.java
 * Name : Nadia Syifa Khairunnisa
 * NIM  : 24060123120023
 * Date : 12 Mei 2025
 * Desc : Implementation of Segitiga class
 */

/**
 *
 * @author Nadia
 */
public class Segitiga extends BangunDatar{
    private double sisi1; //asumsi sebagai alas
    private double sisi2;
    private double sisi3;
    private double tinggi;
    
    public Segitiga(double sisi1, double sisi2, double sisi3, double tinggi){
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungKeliling(){
        return sisi1 + sisi2 + sisi3;
    }
    @Override
    public double hitungLuas(){
        return 0.5 * sisi1 * tinggi ;
    }
}
