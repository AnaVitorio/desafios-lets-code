public class Nomes implements Comparable<Nomes> {
    private String nome;

    public Nomes(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Nomes [nome=" + nome + "]";
    }

    @Override
    public int compareTo(Nomes nome) {
        return this.getNome().compareTo(nome.getNome());
    }

   

    
}