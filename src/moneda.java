import java.util.Map;

public class moneda {
    private Map<String, Double> conversion_rates;

    public Double obtenerTasaDeConversion(String moneda) {
        return conversion_rates.get(moneda);
    }

    public Map<String, Double> getConversion_rates() {
        return conversion_rates;
    }

    public void setConversion_rates(Map<String, Double> conversion_rates) {
        this.conversion_rates = conversion_rates;
    }
}