/*
 * File : Kucing.java
 * Name : Nadia Syifa Khairunnisa
 * NIM  : 24060123120023
 * Date : 14 Mei 2025
 * Desc : Implementation of Kucing class
 */


/**
 *
 * @author Nadia
 */
public class Kucing extends Anabul {
     /******* Atribut *******/
    
    /******* Method *******/
    public Kucing(String nama){
        super(nama);
    }
    
    @Override
    public void Gerak(){
        System.out.println("Kucing bergerak dengan melata");
    }
   
    @Override
    public void Bersuara(){
        System.out.println("Kucing bersuara meong");
    }
   
    @Override
    public String toString (){
        return "Nama : " + getNama() + ", Gerak : Melata" + ", Suara : Meong" ;
    }
}
