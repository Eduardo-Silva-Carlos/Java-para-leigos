package aplicaao.edulab.exercicio;


import java.util.Locale;
import java.util.Scanner;

import static aplicaao.edulab.exercicio.Calculator.Principal.PI;

public class Calculator {

    //public static double  final PI = 3.14159 ;

    public  double circumferences(double radius){
        return 2.0 * PI * radius;
    }

    public double volume (double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }

    public static class Principal {

        public static final double PI= 3.14159;

        public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter radius: ");
            double radius = sc.nextDouble();

            double c = circumference(radius);

            double v = volume(radius);

            System.out.printf("Circumference: %.2f%n", c);
            System.out.printf("Volume: %.2f%n", v);
            System.out.printf("PI value: %.2f%n", PI);
        }
        public static double circumference (double radius){
            return 2.0 * PI * radius;
        }

        public static double volume(double radius){
            return 4.0 * PI * radius * radius * radius / 3.0 ;
        }

    }
}
