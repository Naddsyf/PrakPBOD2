/*
 * File : Dosen.java
 * Name : Nadia Syifa Khairunnisa
 * Date : 17 Maret 2025
 * Desc : Implementation of Dosen class
 */
import java.time.LocalDate;

 public class Dosen extends Pegawai{
    private String fakultas;

    public Dosen(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas){
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.fakultas = fakultas;
    }

    public String getFakultas(){
        return fakultas;
    }

    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }
 }