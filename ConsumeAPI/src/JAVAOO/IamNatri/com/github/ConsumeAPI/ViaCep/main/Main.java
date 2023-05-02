package JAVAOO.IamNatri.com.github.ConsumeAPI.ViaCep.main;

import JAVAOO.IamNatri.com.github.ConsumeAPI.ViaCep.connections.Endereco;
import JAVAOO.IamNatri.com.github.ConsumeAPI.ViaCep.connections.ViaCepConnection;
import JAVAOO.IamNatri.com.github.ConsumeAPI.ViaCep.filesManegement.FileGenerator;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        ViaCepConnection connectionViaCep = new ViaCepConnection();

        System.out.println("Enter a zip code: ");
        var cep = scan.nextLine();
        try {
            Endereco newAdress = connectionViaCep.GetConnection(cep);
            System.out.println(newAdress);
            FileGenerator generator = new FileGenerator();
            generator.saveJson(newAdress);
        }catch(RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            System.out.println("ending app");
        }


    }
}



