/*
 * File : Anabul.java
 * Name : Nadia Syifa Khairunnisa
 * NIM  : 24060123120023
 * Date : 13 Mei 2025
 * Desc : Implementation of Anabul class
 */

/**
 *
 * @author Nadia
 */
public class Anabul {
        /******* Atribut *******/
    private String nama;

    /******* Method *******/
    public Anabul(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public void Gerak(){
        System.out.println("Anabul bergerak dengan cara bagaimana?");
    }

    public void Bersuara(){
        System.out.println("Suara anabul nya bagaimana?");
    }
    
    public String toString (){
        return "Nama : " + getNama();
    }
}
