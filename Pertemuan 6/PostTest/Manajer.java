/*
 * File : Manajer.java
 * Name : Nadia Syifa Khairunnisa
 * Date : 26 April 2025
 * Desc : Implementation of Manajer class
 */
package PostTest;

public class Manajer extends Pegawai {
    /******* Atribut *******/
    private int tunjangan = 700000;

    /******* Method *******/
    public Manajer(String nama){
        setNama(nama);
    }

    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}
