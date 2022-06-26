package lets.code.Generics;

public class Nomes {
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

    
}
