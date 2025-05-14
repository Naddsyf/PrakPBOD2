/*
 * File : BangunDatarGeneric.java
 * Name : Nadia Syifa Khairunnisa
 * NIM  : 24060123120023
 * Date : 12 Mei 2025
 * Desc : Implementation of BangunDatarGeneric class
 */

/**
 *
 * @author Nadia
 */
public class BangunDatarGeneric<T extends BangunDatar>{
    private T bangunDatar;
    
    public void set(T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }
    
    public T get(){
        return bangunDatar;
    }
    
    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
    
    public double hitungLuas(){
        return bangunDatar.hitungLuas();
    }
}
