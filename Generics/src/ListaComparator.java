import java.util.Comparator;

public class ListaComparator implements Comparator<Generica> {

    @Override
    public int compare(Generica arg0, Generica arg1) {
        return arg0.getLabel().compareTo(arg1.getLabel());
    }
    
}
