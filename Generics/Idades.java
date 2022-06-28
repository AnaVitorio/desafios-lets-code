package lets.code.Generics;

public class Idades {
    private int idade;


    public Idades(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Idades [idade=" + idade + "]";
    }

}
