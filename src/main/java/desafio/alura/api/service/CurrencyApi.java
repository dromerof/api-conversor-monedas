package desafio.alura.api.service;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import desafio.alura.api.model.Currency;
import io.github.cdimascio.dotenv.Dotenv;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyApi {

    private final String API_URL;
    private final String API_KEY;

    public CurrencyApi() {
        Dotenv dotenv = Dotenv.load();

        this.API_URL = dotenv.get("API_URL");
        this.API_KEY = dotenv.get("API_KEY");
    }

    public Conversion convertCurrency(Currency from, Currency to, double amount) {

        String urlSearch = String.format("%s%s/pair/%s/%s/%s", API_URL, API_KEY, from, to, amount);

        HttpResponse<String> response;
        try (HttpClient client = HttpClient.newHttpClient()) {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(urlSearch))
                    .build();
            response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String data = response.body();
            JsonObject dataObject = JsonParser.parseString(data).getAsJsonObject();
            double result = dataObject.get("conversion_result").getAsDouble();

            return new Conversion(from, to, amount, result);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}