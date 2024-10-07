package desafio.alura.api.service;

import desafio.alura.api.model.Currency;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Conversion {
    private final Currency fromCurrency;
    private final Currency toCurrency;
    private final double amount;
    private final double result;
    private final LocalDateTime conversionDate;


    public Conversion(Currency fromCurrency, Currency toCurrency, double amount, double result) {
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.amount = amount;
        this.result = result;
        this.conversionDate = LocalDateTime.now();
    }

    public Currency getFromCurrency() {
        return fromCurrency;
    }

    public Currency getToCurrency() {
        return toCurrency;
    }

    public double getAmount() {
        return amount;
    }

    public double getResult() {
        return result;
    }

    public LocalDateTime getConversionDate() {
        return conversionDate;
    }


    public String getMessage() {
        return String.format(
                "El valor de %.2f %s corresponde al valor de => %.2f %s\n%s",
                amount, fromCurrency, result, toCurrency, "----------------------------------------------------------------------\n"
        );
    }



    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        return String.format(
                """
                        ----------------------------------------------------------------------
                        Moneda inicial: %s
                        Moneda final: %s
                        Valor inicial: %.2f
                        Resultado: %.2f
                        Fecha: %s
                        ----------------------------------------------------------------------
                        """,
                fromCurrency, toCurrency, amount, result, conversionDate.format(formatter)
        );
    }

}
