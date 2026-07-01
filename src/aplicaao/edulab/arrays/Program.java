package aplicaao.edulab.arrays;

import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.*;

public class Program {
    public static void main(String[] args) {
       Locale.setDefault(US);
       Scanner sc = new Scanner(System.in);
       // Inicializando um var com n elementos
        int n = sc.nextInt();
        // vetor com três posições
        double[] vect = new double[n];
        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }
        double sum = 0.0;
        for (int i = 0; i < n ; i++) {
            sum =+ vect[i];// sum recebe o vetor
        }
        double avg = sum / n;
        System.out.printf("AVERAGE HEIGHT: %.2f%n" ,avg );

       sc.close();
    }
}
