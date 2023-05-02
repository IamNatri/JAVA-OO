package JAVAOO.IamNatri.com.github.ConsumeAPI.screenmatch.conexaoAPIs;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Omdbconnection {

    public Omdbconnection() {
    }

    public String Omdbconnection(String busca) throws IOException, InterruptedException {
        String json;
        String endereco = "http://www.omdbapi.com/?t=" + busca + "&apikey=eb8b6706";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        return json = response.body();

    }
}
