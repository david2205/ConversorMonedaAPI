import java.util.ArrayList;
import java.util.Map;

public record Moneda(Map<String, Double> conversion_rates) {
    @Override
    public Map<String, Double> conversion_rates() {
        return conversion_rates;
    }

    public Double getConversionRate(String CambioMoneda) {
        return conversion_rates.get(CambioMoneda);
    }
}
