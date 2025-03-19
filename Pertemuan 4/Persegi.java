/*
 * File : Persegi.java
 * Name : Nadia Syifa Khairunnisa
 * Date : 12 Maret 2025
 * Desc : Implementation of Persegi class
 */

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi() {
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border) {
        super(4,warna,border);
        this.sisi = sisi;
    }

    public double getSisi() {
        return this.sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi : " + getSisi());
    }

    public static void printCounterBangunDatar() {
        BangunDatar.printCounterBangunDatar();
    }

    public double getLuas(){
        return sisi * sisi;
    }

    public double getKeliling(){
        return 4 * sisi;
    }
    public double getDiagonal(){
        return (Math.sqrt(2))*sisi;
    }
}