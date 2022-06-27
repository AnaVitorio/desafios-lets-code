public class Generica<T> implements Comparable {
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

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    

}

