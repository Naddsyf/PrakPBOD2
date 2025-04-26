/*
 * File : Pegawai.java
 * Name : Nadia Syifa Khairunnisa
 * NIM  : 24060123120023
 * Date : 26 April 2025
 * Desc : Implementation of Pegawai class 
*/
package PostTest;

public class Pegawai{
    /******* Atribut *******/
    private String nama ;
    private int gajiPokok = 5000000;

    /******* Method *******/
    public void setNama(String nama){
        this.nama = nama;
    }

    public void tampilData(){
        System.out.println("Nama : " + nama + ", " + "Gaji Pokok : " + gajiPokok);
    }
 }