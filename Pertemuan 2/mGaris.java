/* Nama File : mGaris.java
 * Deskripsi : Program untuk menguji fungsionalitas class garis
 * Pembuat   : Nadia Syifa Khairunnisa / 24060123120023
 * Tanggal   : 22 Februari 2025
 */
public class mGaris {
    public static void main(String[] args) {
        /* ======= Membuat objek titik ======= */
        titik T1 = new titik(7,11);
        titik T2 = new titik(11,19);
        titik T3 = new titik(2,9);
        titik T4 = new titik(5,15);

        /* ======= Membuat objek garis ======= */
        garis G1 = new garis(T1,T2);
        garis G2 = new garis();
        garis G3 = new garis();

        System.out.println("Titik Awal G1 : (" + G1.getTitikAwal().getAbsis() + " , " + G1.getTitikAwal().getOrdinat() + ")");
        System.out.println("Titik Akhir G1 : (" + G1.getTitikAkhir().getAbsis() + " , " + G1.getTitikAkhir().getOrdinat() + ")\n");

        System.out.println("Titik Awal G2 : (" + G2.getTitikAwal().getAbsis() + " , " + G2.getTitikAwal().getOrdinat() + ")");
        System.out.println("Titik Akhir G2 : (" + G2.getTitikAkhir().getAbsis() + " , " + G2.getTitikAkhir().getOrdinat() + ")\n");

        System.out.println("======= Merubah titik G2 =======");
        G2.setTitikAwal(T3);
        System.out.println("Titik Awal G2 : (" + G2.getTitikAwal().getAbsis() + " , " + G2.getTitikAwal().getOrdinat() + ")");
        G2.setTitikAkhir(T4);
        System.out.println("Titik Akhir G2 : (" + G2.getTitikAkhir().getAbsis() + " , " + G2.getTitikAkhir().getOrdinat() + ")\n");

        System.out.println("======= Jumlah objek garis =======");
        System.out.println("Jumlah Objek Garis : " + garis.getCounterGaris());

        System.out.println("\n======= Menghitung panjang garis =======");
        System.out.println("Panjang G1 : " + G1.panjangGaris());
        System.out.println("Panjang G2 : " + G2.panjangGaris());

        System.out.println("\n======= Menghitung gradien garis =======");
        System.out.println("Gradien G1 : " + G1.gradienGaris());
        System.out.println("Gradien G2 : " + G2.gradienGaris());

        System.out.println("\n======= Titik tengah garis =======");
        System.out.println("TItik tengah G1 : (" + G1.tengahGaris().getAbsis() + " , " + G1.tengahGaris().getOrdinat() + ")");
        System.out.println("Titik tengah G2 : (" + G2.tengahGaris().getAbsis() + " , " + G2.tengahGaris().getOrdinat() + ")");

        System.out.println("\n======= Cek Sejajar =======");
        System.out.println("Apakah G1 dan G2 sejajar? " + G1.isSejajar(G2));

        System.out.println("\n====== Cek Tegak Lurus =======");
        System.out.println("Apakah G1 dan G2 tegak lurus? " + G1.isTegakLurus(G2));

        System.out.println("\n======= Print G3 =======");
        G3.printGaris();

        System.out.println("\n======= Persamaan Garis =======");
        System.out.println("Persamaan G1 --> " + G1.persamanGaris());
        System.out.println("Persamaan G2 --> " + G2.persamanGaris());
        System.out.println("Persamaan G3 --> " + G3.persamanGaris());
    }
    

}
