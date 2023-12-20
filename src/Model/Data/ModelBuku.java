package Model.Data;

import java.util.ArrayList;

import Model.JSON.ModelJSON;
import Node.Buku;

import com.google.gson.reflect.TypeToken;

public class ModelBuku {

    ArrayList<Buku> listBuku;
    ModelJSON<Buku> modelJSONBuku;

    public ModelBuku() {
        listBuku = new ArrayList<Buku>();
        modelJSONBuku = new ModelJSON<>("Database/Buku.json");
        loadData();
    }

    public void addBuku(Buku Bukutakaan) {
        listBuku.add(Bukutakaan);
    }

    public Buku getBuku(int id) {
        return listBuku.get(id);
    }

    // public int searchBuku(String nama) {
    //     for (Buku Buku : listBuku) {
    //         if (Buku.getNama().equals(nama)) {
    //             return listBuku.indexOf(Buku);
    //         }
    //     }
    //     return -1;
    // }

    private void loadData() {
        listBuku = modelJSONBuku.readFromFile(new TypeToken<ArrayList<Buku>>() {}.getType());
    }

    public void commitData() {
        modelJSONBuku.writeToFile(listBuku);
    }
}
