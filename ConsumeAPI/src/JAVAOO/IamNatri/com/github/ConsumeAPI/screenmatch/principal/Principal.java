package JAVAOO.IamNatri.com.github.ConsumeAPI.screenmatch.principal;

import JAVAOO.IamNatri.com.github.ConsumeAPI.screenmatch.conexaoAPIs.Omdbconnection;
import JAVAOO.IamNatri.com.github.ConsumeAPI.screenmatch.modelos.Titulo;
import JAVAOO.IamNatri.com.github.ConsumeAPI.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        String busca = "";
        Scanner scanner = new Scanner(System.in);
        Omdbconnection conexaoOmdb = new Omdbconnection();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        FileWriter salvandoBuscas = new FileWriter("Filmes.json");
        List<Titulo> titulos = new ArrayList<>();



        while(!busca.equalsIgnoreCase("sair")) {
            if (busca.equalsIgnoreCase("sair")) {
                break;
            }
            System.out.println("""
                    Para sair digite 'sair'
                                        
                    Digite um filme para busaca:
                                        """);
            busca = scanner.nextLine();
            String json = conexaoOmdb.Omdbconnection(busca);
            TituloOmdb TituloOmdb = gson.fromJson(json, TituloOmdb.class);
            Titulo titulo = new Titulo(TituloOmdb);
            System.out.println("Titulo adicionado: " + titulo);
            titulos.add(titulo);
        }
        salvandoBuscas.write(gson.toJson(titulos));
        salvandoBuscas.close();
    }
}