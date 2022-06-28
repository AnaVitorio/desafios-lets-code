import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) throws Exception {
        
        List<Nomes> nomes = new ArrayList<>();
        List<Idades> idades = new ArrayList<>();

        idades.add(new Idades(10));
        idades.add(new Idades(15));
        idades.add(new Idades(5));
        idades.add(new Idades(22));

        nomes.add(new Nomes("Lucas"));
        nomes.add(new Nomes("Maria"));
        nomes.add(new Nomes("João"));
        nomes.add(new Nomes("Ana"));

        

        System.out.println("Nomes Ordem Crescente");

        
        List<Nomes> nomesCrescente = MyOwnLists.asListedSorted(nomes, new ListaComparatorCrescente());

        for(Nomes nome : nomes){
            System.out.println(nome);
        }

        System.out.println("\nNomes Ordem Decrescente");

        
        List<Nomes> nomesDecrescente = MyOwnLists.asListedSorted(nomes, new ListaComparatorDescrescente());

        for(Nomes nome : nomes){
            System.out.println(nome);
        }

        System.out.println("\nIdades Ordem Decrescente");

        List<Nomes> idadesDescrescente = MyOwnLists.asListedSorted(idades, new ListaComparatorDescrescente());
        System.out.println();
        for(Idades idade : idades){
            System.out.println(idade);
        }

        System.out.println("\nIdades Ordem Crescente");

        List<Nomes> idadesCrescente = MyOwnLists.asListedSorted(idades, new ListaComparatorCrescente());
        System.out.println();
        for(Idades idade : idades){
            System.out.println(idade);
        }

       
        
    }
}