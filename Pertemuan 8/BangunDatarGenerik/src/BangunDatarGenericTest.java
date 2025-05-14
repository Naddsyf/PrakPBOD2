/*
 * File : BangunDatarGenericTest.java
 * Name : Nadia Syifa Khairunnisa
 * NIM  : 24060123120023
 * Date : 12 Mei 2025
 * Desc : Implementation of BangunDatarGenericTest class
 */

/**
 *
 * @author Nadia
 */
public class BangunDatarGenericTest {
    public static void main(String[] args) {
        /***** Lingkaran *****/
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = 
                new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("keliling lingkaran : " 
                + bdg.hitungKeliling());
         System.out.println("Luas lingkaran : " 
                + bdg.hitungLuas());
        System.out.println("tipe generic : " 
                + bdg.get().getClass().getName());
        
        /***** Persegi *****/
        Persegi P = new Persegi(4);
        BangunDatarGeneric<Persegi> psg = 
                new BangunDatarGeneric<Persegi>();
        psg.set(P);
        System.out.println("\nkeliling persegi : " 
                + psg.hitungKeliling());
         System.out.println("Luas persegi : " 
                + psg.hitungLuas());
        System.out.println("tipe generic : " 
                + psg.get().getClass().getName());
        
        /***** Persegi Panjang *****/
        PersegiPanjang PP = new PersegiPanjang(5,3);
        BangunDatarGeneric<PersegiPanjang> pp = 
                new BangunDatarGeneric<PersegiPanjang>();
        pp.set(PP);
        System.out.println("\nkeliling persegi panjang : " 
                + pp.hitungKeliling());
         System.out.println("Luas persegi panjang : " 
                + pp.hitungLuas());
        System.out.println("tipe generic : " 
                + pp.get().getClass().getName());
        
        /***** Segitiga *****/
        Segitiga S = new Segitiga(8,10,10,6);
        BangunDatarGeneric<Segitiga> ss = 
                new BangunDatarGeneric<Segitiga>();
        ss.set(S);
        System.out.println("\nkeliling segitiga : " 
                + ss.hitungKeliling());
         System.out.println("Luas segitiga : " 
                + ss.hitungLuas());
        System.out.println("tipe generic : " 
                + ss.get().getClass().getName());
    }
}
