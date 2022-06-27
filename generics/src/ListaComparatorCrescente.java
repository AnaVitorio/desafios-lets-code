import java.util.Comparator;

public class ListaComparatorCrescente<Generica> implements Comparator<Generica> {

    @Override
    public int compare(Generica arg1, Generica arg2) {
        //System.out.println(arg1.getClass().getName());
        String classe = arg1.getClass().getName();
        
        
        if((arg1 instanceof Nomes) && (arg2 instanceof Nomes)){
            Nomes nome1 = (Nomes) arg1;
            Nomes nome2 = (Nomes) arg2;

            return nome1.getNome().compareTo(nome2.getNome());
        } else {
            return 0;
        }

    }

}
//reflection
// Class<T> cls
// cls.getConstructor()[0].newInstance(null) instancia a classe passada como parâmetro.
//getClass().getMethods()
