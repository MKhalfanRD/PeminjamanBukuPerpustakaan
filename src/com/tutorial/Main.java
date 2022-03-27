package com.tutorial;

class Perpustakaan{
    String buku;
    String pengarang;

    Perpustakaan(String buku, String pengarang ){
        this.buku = buku;
        this.pengarang = pengarang;
    }

    void dataPerpustakaan(){
        System.out.println();
        System.out.println("Nama Buku = " + buku);
        System.out.println("Pengarang = " + pengarang);
        System.out.println();
        System.out.println("==================================");
    }

}

class Peminjam{
    String nama;
    String NPM;
    String jurusan;

    Perpustakaan buku;

    void pinjamBuku(Perpustakaan buku){
        this.buku = buku;
    }

    Peminjam(String nama, String NPM, String jurusan){
        this.nama = nama;
        this.NPM = NPM;
        this.jurusan = jurusan;
    }

    void dataPeminjam(){
        System.out.println();
        System.out.println("****** Data Peminjaman Buku ******");
        System.out.println();
        System.out.println("Nama : " + nama);
        System.out.println("NPM  : " + NPM);
        System.out.println("Jurusan : " + jurusan);
        buku.dataPerpustakaan();
    }

}

public class Main {

    public static void main(String[] args){
        Peminjam peminjam1 = new Peminjam("M. Khalfan R.D", "2055061014", "Informatika");
        Perpustakaan perpus1 = new Perpustakaan("Arduino","Elon Musk");

        peminjam1.pinjamBuku(perpus1);
        peminjam1.dataPeminjam();
    }
}
