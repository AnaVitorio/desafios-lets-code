public class Idades implements Comparable<Idades> {
    private int idade;

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

    @Override
    public int compareTo(Idades o) {
        // TODO Auto-generated method stub
        return 0;
    }


}
