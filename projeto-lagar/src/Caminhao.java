//Um timer no caminhão
public class Caminhao {
    private String nome;
    private int contador = 0;


    public Caminhao(String nome) {
        this.nome = nome;
    }
    
    
    public String getNome() {
        return nome;
    }

    public int getContador() {
        return contador;
    }


    public void setContador(int contador) {
        this.contador = contador;
    }
   

}
