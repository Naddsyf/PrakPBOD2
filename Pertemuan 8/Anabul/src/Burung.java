/*
 * File : Burung.java
 * Name : Nadia Syifa Khairunnisa
 * NIM  : 24060123120023
 * Date : 14 Mei 2025
 * Desc : Implementation of Burung class
 */

/**
 *
 * @author Nadia
 */
public class Burung extends Anabul { 
    /******* Atribut *******/
    
    /******* Method *******/
    public Burung(String nama){
        super(nama);
    }
    
    @Override
    public void Gerak(){
        System.out.println("Burung bergerak dengan terbang");
    }
   
    @Override
    public void Bersuara(){
        System.out.println("Burung bersuara cuit");
    }
   
    @Override
    public String toString (){
        return "Nama : " + getNama() + ", Gerak : Terbang" + ", Suara : Cuit" ;
    }
}
