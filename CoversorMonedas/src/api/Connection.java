package api;

import com.google.gson.Gson;
import model.Result;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Connection {

    public String connection(String original, String toConvert, int amount) {
        final String url = "https://v6.exchangerate-api.com/v6/ccd69c4110b3c645d91da8ab/pair/" + original + "/" + toConvert + "/" + amount;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            Gson gson = new Gson();
            Result result = gson.fromJson(json, Result.class);
            return result.conversion_result();



        } catch ( IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
