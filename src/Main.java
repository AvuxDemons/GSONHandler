import Model.Data.*;
import Node.*;

public class Main {
    public static void main(String[] args) {

        ModelPerpus modelPerpus = new ModelPerpus();
        
        // modelPerpus.addPerpus(new Perpus("Perpustakaan 1"));

        // int idPerpus = modelPerpus.searchPerpus("Perpustakaan 1");
        // Perpus perpus = modelPerpus.getPerpus(idPerpus);

        // perpus.addBuku(new Buku("Buku 1", new Penerbit("Penerbit 1"))); 
        
        modelPerpus.commitData();
    }
}