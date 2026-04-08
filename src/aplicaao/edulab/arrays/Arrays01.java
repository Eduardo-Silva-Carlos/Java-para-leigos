package aplicaao.edulab.arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrays01 {
    public static void main(String[] args) {
        ArrayList<String> cronograma = new ArrayList<String>(10);

        cronograma.add("Matemática");
        cronograma.add("Linguagem Formais");
        cronograma.add("Lógica de programação");
        cronograma.add("Inglês");
        cronograma.add("Português");
        cronograma.add("Java");
        cronograma.add("Orientação a objetos");
        cronograma.add("System Design");
        cronograma.add("Matemática discreta");

        Iterator it = cronograma.iterator();

        while (it.hasNext()){
            String aux = (String) it.next();
            System.out.println(aux);
        }


    }
}
