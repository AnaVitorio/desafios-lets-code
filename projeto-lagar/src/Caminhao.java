import java.util.List;

//Um timer no caminhão
public class Caminhao {
    private String nome;
    private int contador = 0;
    private List<Integer> capacidadeTransCaminhao;

    public Caminhao(String nome, List<Integer> capacidadeTransCaminhao) {
        this.nome = nome;
        this.capacidadeTransCaminhao = capacidadeTransCaminhao;
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

    public List<Integer> getCapacidadeTransCaminhao() {
        return capacidadeTransCaminhao;
    }



}
