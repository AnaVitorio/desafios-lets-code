import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyOwnLists {
    
    public static <T> List<T> asListedSorted(List<T> lista, Comparator<T> comparator){
        Collections.sort(lista, comparator);
        return lista;
    }

    
}
