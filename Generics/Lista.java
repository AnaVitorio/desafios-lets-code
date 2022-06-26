package lets.code.Generics;

import java.util.Comparator;

public class Lista implements Comparator<Nomes> {

    @Override
    public int compare(Nomes arg0, Nomes arg1) {
        
        return arg0.getNome().compareTo(arg1.getNome());
    }
    
}
