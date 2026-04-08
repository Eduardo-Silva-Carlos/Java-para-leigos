package aplicaao.edulab.oop.aplication.exercice;

public class CurrencyConverter {

    public static double IOF = 0.6;

    public static double dollarToReal(double amount , double dollarPricer){
        return amount * dollarPricer * (1.0 + IOF);
    }

}
