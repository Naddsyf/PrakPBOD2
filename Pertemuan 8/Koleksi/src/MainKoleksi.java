/*
 * File : MainKoleksi.java
 * Name : Nadia Syifa Khairunnisa
 * NIM  : 24060123120023
 * Date : 12 Mei 2025
 * Desc : Implementation of MainKoleksi class
 */


/**
 *
 * @author Nadia
 */
public class MainKoleksi {
    public static void main(String[] args){
        Koleksi<Character> Karakter = new Koleksi<>(10);
        
        //Menambahkan elemen
        System.out.println("Menambahkan 10 karakter");
        for (char i = 'A'; i <= 'J'; i++){
            Karakter.add(i);
        }
        Karakter.showAll();
        
        //Banyak elemen
        System.out.println("Banyak elemen = " + Karakter.getSize());
        
        //Mengubah elemen indeks 4
        Karakter.setIsi(4,'S');
        System.out.println("\nMengubah elemen indeks 4 menjadi 'S'");
        Karakter.showAll();
        
        //Menghapus 2 elemen terakhir
        System.out.println("\nMenghapus elemen");
        System.out.println("Elemen yang dihapus pertama : " + Karakter.delete());
        System.out.println("Elemen yang dihapus kedua : " + Karakter.delete());
        System.out.println("Banyak elemen sekarang : " + Karakter.getSize());
        Karakter.showAll();
        
        
    }
}
