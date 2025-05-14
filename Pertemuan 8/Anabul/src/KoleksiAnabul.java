/*
 * File : KoleksiAnabul.java
 * Name : Nadia Syifa Khairunnisa
 * NIM  : 24060123120023
 * Date : 14 Mei 2025
 * Desc : Implementation of KoleksiAnabul class
 */

/**
 *
 * @author Nadia
 */


import java.util.Random;

public class KoleksiAnabul {
    public static void main(String[] args){
        Koleksi<Anabul> koleksi = new Koleksi<>(10);
        Random random = new Random();
        
        String[] kucing = { "Mola", "Noy", "Stella"};
        String[] anjing = { "Heli", "Charlie", "Max"};
        String[] burung = { "Leo", "Popi", "Jake"};
        
        for (int i = 0; i < 10; i++) {
            int type = random.nextInt(3);
            String anabul;
            if (type == 0){
                anabul = kucing[random.nextInt(kucing.length)] + (i+1);
                koleksi.add(new Kucing(anabul));
            }
            else if (type == 1){
                anabul = anjing[random.nextInt(anjing.length)] + (i+1);
                koleksi.add(new Anjing(anabul));
            }
            else {
                anabul = burung[random.nextInt(burung.length)] + (i+1);
                koleksi.add(new Burung(anabul));
            }
        }
        
        koleksi.ShowAll();
    }
}
