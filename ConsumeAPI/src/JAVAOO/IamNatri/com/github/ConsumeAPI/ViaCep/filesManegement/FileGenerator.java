package JAVAOO.IamNatri.com.github.ConsumeAPI.ViaCep.filesManegement;

import JAVAOO.IamNatri.com.github.ConsumeAPI.ViaCep.connections.Endereco;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class FileGenerator {

    public void saveJson(Endereco adress) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter writer = new FileWriter(adress.cep() + ".json");
        writer.write(gson.toJson(adress));
        writer.close();


    }

}

