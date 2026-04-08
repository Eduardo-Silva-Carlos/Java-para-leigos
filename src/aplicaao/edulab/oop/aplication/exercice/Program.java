package aplicaao.edulab.oop.aplication.exercice;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.println("What is the dolar price ?");
        double dollarPrice = in.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double amount = in.nextDouble();

        double result = CurrencyConverter.dollarToReal(amount,dollarPrice);
        System.out.printf("Amount to be paid in reals = %.2f%n", result);

        in.close();
    }
}
