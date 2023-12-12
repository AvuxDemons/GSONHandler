package Model.Data;

import java.util.ArrayList;

import Model.JSON.ModelJSON;
import Node.Perpus;

import com.google.gson.reflect.TypeToken;

public class ModelPerpus {

    ArrayList<Perpus> listPerpus;
    ModelJSON<Perpus> modelJSONPerpus;

    public ModelPerpus() {
        listPerpus = new ArrayList<Perpus>();
        modelJSONPerpus = new ModelJSON<>("Database/Perpus.json");
        loadData();
    }

    public void addPerpus(Perpus perpustakaan) {
        listPerpus.add(perpustakaan);
    }

    public Perpus getPerpus(int id) {
        return listPerpus.get(id);
    }

    public int searchPerpus(String nama) {
        for (Perpus perpus : listPerpus) {
            if (perpus.getNama().equals(nama)) {
                return listPerpus.indexOf(perpus);
            }
        }
        return -1;
    }

    private void loadData() {
        listPerpus = modelJSONPerpus.readFromFile(new TypeToken<ArrayList<Perpus>>() {}.getType());
    }

    public void commitData() {
        modelJSONPerpus.writeToFile(listPerpus);
    }
}
