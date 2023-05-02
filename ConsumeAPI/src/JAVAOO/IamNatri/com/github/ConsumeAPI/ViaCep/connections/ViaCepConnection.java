package JAVAOO.IamNatri.com.github.ConsumeAPI.ViaCep.connections;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ViaCepConnection {

    public ViaCepConnection() {
    }

    public Endereco GetConnection(String cep) {
        String json;
        try {

            cep = String.valueOf(Integer.parseInt(cep.replaceAll("[^0-9]", "")));
            URI url = URI.create("https://viacep.com.br/ws/" + cep + "/json/");
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(url)
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Endereco.class);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando.");
        }


        return null;
    }
}

//    public String GetConnection(int cep){
//        String json;
//        try {
//            cep = Integer.parseInt(Integer.toString(cep));
//            URL url = new URL("https://viacep.com.br/ws/" + cep + "/json/");
//            URLConnection urlConnection = url.openConnection();
//            BufferedReader br = new BufferedReader(new InputStreamReader(is));
//            StringBuilder jsonSb = new StringBuilder();
//
//            br.lines().forEach(l -> jsonSb.append(l.trim()));
//
//            json = jsonSb.toString();
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//
//        return json;
//
//    }


