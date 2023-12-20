package Model.Data;

import java.util.ArrayList;

import Model.JSON.ModelJSON;
import Node.Penerbit;

import com.google.gson.reflect.TypeToken;

public class ModelPenerbit {

    ArrayList<Penerbit> listPenerbit;
    ModelJSON<Penerbit> modelJSONPenerbit;

    public ModelPenerbit() {
        listPenerbit = new ArrayList<Penerbit>();
        modelJSONPenerbit = new ModelJSON<>("Database/Penerbit.json");
        loadData();
    }

    public void addPenerbit(Penerbit Penerbittakaan) {
        listPenerbit.add(Penerbittakaan);
    }

    public Penerbit getPenerbit(int id) {
        return listPenerbit.get(id);
    }

    // public int searchPenerbit(String nama) {
    //     for (Penerbit Penerbit : listPenerbit) {
    //         if (Penerbit.getNama().equals(nama)) {
    //             return listPenerbit.indexOf(Penerbit);
    //         }
    //     }
    //     return -1;
    // }

    private void loadData() {
        listPenerbit = modelJSONPenerbit.readFromFile(new TypeToken<ArrayList<Penerbit>>() {}.getType());
    }

    public void commitData() {
        modelJSONPenerbit.writeToFile(listPenerbit);
    }
}
