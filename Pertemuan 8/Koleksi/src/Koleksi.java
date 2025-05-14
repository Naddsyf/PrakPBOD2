/*
 * File : Koleksi.java
 * Name : Nadia Syifa Khairunnisa
 * NIM  : 24060123120023
 * Date : 12 Mei 2025
 * Desc : Implementation of Koleksi class
 */

/**
 *
 * @author Nadia
 */
import java.util.List;
import java.util.ArrayList;

public class Koleksi<T> {
    //Atribut
    private List<T> wadah;
    private int nbelm;
    
    //Method
    public Koleksi(int kapasitas){
        this.wadah = new ArrayList<>(kapasitas);
        this.nbelm = 0;
    }
    
    public T getIsi(int indeks){
        if (indeks < 0 || indeks >= this.nbelm){
            throw new IndexOutOfBoundsException("Indeks di luar batas");
        }
        return this.wadah.get(indeks);
    }
    
    public void setIsi(int indeks, T elemen){
        if (indeks < 0 || indeks >= this.nbelm){
            throw new IndexOutOfBoundsException("Indeks di luar batas");
        }
        this.wadah.set(indeks,elemen);
    }
    
    public int getSize(){
        return this.nbelm;
    }
    
    public void setSize(int x){
        if (x < 0){
            throw new IllegalArgumentException("Size tidak boleh negatif");
        }
        this.nbelm = x;
    }
    
    public void add(T elemen){
        this.wadah.add(elemen);
        this.nbelm++;
    }
    
    public T delete(){
        if (this.nbelm > 0){
            T elemenTerakhir = this.wadah.get(this.nbelm - 1);
            this.wadah.remove(this.nbelm-1);
            this.nbelm--;
            return elemenTerakhir;
        }
        else{
            throw new IllegalStateException("Koleksi kosong");
        }
    }
    
    public void showAll(){
        System.out.println("Isi koleksi : ");
        for (int i = 0; i < nbelm; i++){
            System.out.println(this.wadah.get(i));
        }
    }
}
