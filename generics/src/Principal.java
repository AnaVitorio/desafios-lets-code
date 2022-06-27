import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) throws Exception {
        
        List<Nomes> nomes = new ArrayList<>();

        nomes.add(new Nomes("Lucas"));
        nomes.add(new Nomes("Maria"));
        nomes.add(new Nomes("João"));
        nomes.add(new Nomes("Ana"));

        for(Nomes nome : nomes){
            System.out.println(nome);
        }

        System.out.println();

        
        List<Nomes> nomesList = MyOwnLists.asListedSorted(nomes, new ListaComparatorCrescente());

        for(Nomes nome : nomes){
            System.out.println(nome);
        }

        List<Nomes> decrescente = MyOwnLists.asListedSorted(nomes, new ListaComparatorDescrescente());
        System.out.println();
        for(Nomes nome : nomes){
            System.out.println(nome);
        }

        
    }
}
