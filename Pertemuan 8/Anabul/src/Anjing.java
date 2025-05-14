/*
 * File : Anjing.java
 * Name : Nadia Syifa Khairunnisa
 * NIM  : 24060123120023
 * Date : 14 Mei 2025
 * Desc : Implementation of Anjing class
 */

/**
 *
 * @author Nadia
 */
public class Anjing extends Anabul {  
    /******* Atribut *******/
    
    /******* Method *******/
    public Anjing(String nama){
        super(nama);
    }
    
    @Override
    public void Gerak(){
        System.out.println("Anjing bergerak dengan melata");
    }
   
    @Override
    public void Bersuara(){
        System.out.println("Anjing bersuara guk-guk");
    }
    
    @Override
    public String toString (){
        return "Nama : " + getNama() + ", Gerak : Melata" + ", Suara : guk-guk" ;
    }
    
}
