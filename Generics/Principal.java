package lets.code.Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Nomes> nomes = new ArrayList<>();

        nomes.add(new Nomes("Lucas"));
        nomes.add(new Nomes("Maria"));
        nomes.add(new Nomes("João"));
        nomes.add(new Nomes("Ana"));

        for(Nomes nome : nomes){
            System.out.println(nome);
        }

        System.out.println();

        Collections.sort(nomes, new Lista());
        // List<Empregado> empregadosList = 
        //MyOwnLists.asListedSorted(new Empregado[]{new Empregado()},new Comparator<Empregado>(){...});
        List<Nomes> nomesList = MyOwnLists.asListedSorted(nomes, new ListaComparator());

        for(Nomes nome : nomes){
            System.out.println(nome);
        }
        
    }

}
