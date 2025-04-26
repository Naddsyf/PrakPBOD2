/*
 * File : Programmer.java
 * Name : Nadia Syifa Khairunnisa
 * NIM  : 24060123120023
 * Date : 26 April 2025
 * Desc : Implementation of Programmer class
 */
package PostTest;
public class Programmer extends Pegawai {
    /******* Atribut *******/
    private int bonus = 450000;

    /******* Method *******/
    public Programmer(String nama){
        setNama(nama);
    }

    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}
