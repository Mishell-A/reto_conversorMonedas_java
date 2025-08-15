import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class consultarMoneda {

    public moneda buscaMoneda(String codigoIso) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/a6c581c87a6c41ac5cfc506d/latest/" + codigoIso);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontré ese valor");
        }
    }
}