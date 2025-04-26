/*
 * File : MainAnabul.java
 * Name : Nadia Syifa Khairunnisa
 * Date : 26 April 2025
 * Desc : Implementation of MainAnabul
 */
package TugasLanjutan;

public class MainAnabul {
    public static void main(String[] args) {
        System.out.println("===== Anabul =====");
        Anabul anabul = new Anabul();
        anabul.Gerak();
        anabul.Bersuara();

        System.out.println("\n===== Kucing =====");
        Anabul kucing = new Kucing();
        kucing.Gerak();
        kucing.Bersuara();

        System.out.println("\n===== Anjing =====");
        Anabul anjing = new Anjing();
        anjing.Gerak();
        anjing.Bersuara();

        System.out.println("\n===== Burung =====");
        Anabul burung = new Burung();
        burung.Gerak();
        burung.Bersuara();
    }
        
}
