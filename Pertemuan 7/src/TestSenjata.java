/*
 * File : TestSenjata.java
 * Name : Nadia Syifa Khairunnisa
 * NIM  : 24060123120023
 * Date : 3 Mei 2025
 * Desc : Implementation of TestSenjata class
 */

/**
 *
 * @author ASUS
 */
public class TestSenjata {
    
    public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");
        KontrolSenjata kontrolAK47 = new KontrolSenjata(ak47);
        KontrolSenjata kontrolm16 = new KontrolSenjata(m16);
        
        kontrolAK47.menembak(2);
        kontrolAK47.isiPeluru(3);
        kontrolAK47.menembak(5);
        
        System.out.println("===========================");
        
        kontrolm16.menembak(1);
        kontrolm16.isiPeluru(5);
        kontrolm16.menembak(2);
    }
}
