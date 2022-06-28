public class Generica<T extends Comparable<T>> {
    private T label;


    public Generica(T label) {
        this.label = label;
    }

    public T getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return "Generica [t=" + label + "]";
    }

    
    
}
