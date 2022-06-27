import java.util.Comparator;

public class ListaComparatorDescrescente<Generica> implements Comparator<Generica>  {

    @Override
    public int compare(Generica arg1, Generica arg2) {

        if((arg1 instanceof Nomes) && (arg2 instanceof Nomes)){
            Nomes nome1 = (Nomes) arg1;
            Nomes nome2 = (Nomes) arg2;

            return nome2.getNome().compareTo(nome1.getNome());
        } 

        return 0;

    }
    
}
