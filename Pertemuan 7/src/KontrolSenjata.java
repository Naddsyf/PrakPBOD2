/*
 * File : KontrolSenjata.java
 * Name : Nadia Syifa Khairunnisa
 * NIM  : 24060123120023
 * Date : 3 Mei 2025
 * Desc : Implementation of KontrolSenjata class
 */

/**
 *
 * @author ASUS
 */
public class KontrolSenjata {
    //Atribut
    Senjata senjata;
    
    //Method
    KontrolSenjata(Senjata s){
        this.senjata = s;
    }
    
    public boolean isAdaPeluru(){
        return senjata.getPeluru() > 0;
    }
    
    public void isiPeluru(int jumPeluru){
        if (jumPeluru > 0) {
            senjata.setPeluru(senjata.getPeluru() + jumPeluru);
            System.out.println(">> Peluru berhasil ditambah: " + jumPeluru);
        }
        else {
            System.out.println("Jumlah peluru harus lebih dari 0");
        }
    }
    
    public void menembak(int jumlah){
        System.out.println(">> Siap menembak " + jumlah + " Kali" );
        if (senjata.getPeluru() == 0){
            System.out.println("Peluru Habis");
            return;
        }
        else{
            for (int i = 0; i < jumlah ; i++){
                if (senjata.getPeluru() > 0){
                    System.out.println(senjata.getBunyi());
                    senjata.setPeluru(senjata.getPeluru() - 1);
                }
                else {
                    System.out.println("Gagal tembak, Peluru Habis");
                }
            }
            System.out.println(">> Peluru sisa: " + senjata.getPeluru());
        }
    }
    
    public void pasangBayonet(){
        senjata.setMenusuk(true);
        System.out.println("Bayonet sudah terpasang");
    }
    
    public void menusuk(){
        if(senjata.isMenusuk()){
            System.out.println("jleb");
        }
        else{
            System.out.println("Bayonet belum terpasang");
        }
    }
}
