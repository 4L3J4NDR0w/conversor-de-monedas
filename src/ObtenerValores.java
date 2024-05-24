import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ObtenerValores {
    String direccion = "https://v6.exchangerate-api.com/v6/176b5e589eb781804d8bbb0d/latest/USD";
    Gson gson = new Gson();
    double usd;
    double cop;
    double brl;
    double ars;
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(direccion))
            .build();
    HttpResponse<String> response;

    {
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();
            JsonObject conversionRatesJson = jsonObject.getAsJsonObject("conversion_rates");
            Valores conversionRates = gson.fromJson(conversionRatesJson, Valores.class);

            usd = conversionRates.USD();
            cop = conversionRates.COP();
            brl = conversionRates.BRL();
            ars = conversionRates.ARS();

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


}
