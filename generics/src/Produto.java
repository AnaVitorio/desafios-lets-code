public class Produto implements Comparable<Produto>{
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Produto produto) {
        //retorno -1 para o que você quer que venha antes
        if(this.getPreco() < produto.getPreco()){
            return -1;
        }

        if(this.getPreco() > produto.getPreco()){
            return 1;
        }

        return 0;
    }



}
