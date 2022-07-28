import java.util.ArrayList;
import java.util.List;

public class Fazenda {
    private List<Plantacao> listaplantacoes = new ArrayList<>();

    public List<Plantacao> getListaPlantacoes() {
        return listaplantacoes;
    }

    public void adicionarPlantacoes(int numeroPlantacoes){
        for(int i = 0; i < numeroPlantacoes; i++){
            Plantacao plantacao = new Plantacao();
            plantacao.setNome(Integer.toString(i));
            listaplantacoes.add(plantacao);

        }
    }

}
