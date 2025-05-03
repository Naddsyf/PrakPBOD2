/*
 * File : Senjata.java
 * Name : Nadia Syifa Khairunnisa
 * NIM  : 24060123120023
 * Date : 3 Mei 2025
 * Desc : Implementation of Senjata class
 */

/**
 *
 * @author ASUS
 */
public class Senjata {
    //Atribut
    private String bunyi;
    private boolean menusuk;
    private int peluru;
    
    //Method
    Senjata(String bunyi){
        this.bunyi = bunyi;
        this.menusuk = false;
        this.peluru = 0;
    }
    
    public String getBunyi(){
        return bunyi;
    }
    
    public int getPeluru(){
        return peluru;
    }
    
    public boolean isMenusuk(){
        return menusuk;
    }
    
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    public void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
    }
    
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
}
