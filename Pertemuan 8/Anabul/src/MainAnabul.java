/*
 * File : MainAnabul.java
 * Name : Nadia Syifa Khairunnisa
 * NIM  : 24060123120023
 * Date : 14 Mei 2025
 * Desc : Implementation of MainAnabul class
 */

/**
 *
 * @author Nadia
 */
public class MainAnabul {
    public static void main(String[] args){
        System.out.println("==== Anabul ====");
        Anabul anabul = new Anabul("Kosong");
        anabul.Gerak();
        anabul.Bersuara();
        
        System.out.println("\n==== Kucing ====");
        Anabul kucing = new Kucing("Mola");
        kucing.Gerak();
        kucing.Bersuara();
        
        System.out.println("\n==== Anjing ====");
        Anabul anjing = new Anjing("Heli");
        anjing.Gerak();
        anjing.Bersuara();
        
        System.out.println("\n==== Burung ====");
        Anabul burung = new Burung("Leo");
        burung.Gerak();
        burung.Bersuara();
    }
}
