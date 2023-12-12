package Node;

import java.util.ArrayList;

public class Perpus {
    String nama;
    ArrayList<Buku> listBuku;

    public Perpus(String nama) {
        this.nama = nama;
        listBuku = new ArrayList<Buku>();
    }

    public String getNama() {
        return nama;
    }

    public void addBuku(Buku buku) {
        listBuku.add(buku);
    }

    public ArrayList<Buku> getBuku() {
        return listBuku;
    }

}
