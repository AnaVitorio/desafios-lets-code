import java.util.List;
import java.util.Map;

public interface LeitorInterface {
    public String getData();
    public int getQuantidadeVariedade();
    public int getQuantidadePlantacoes();
    public Map<String, Integer> getVariedadeEQtd();
    public Map<String, Integer> getVariedadeEDist();
    public int getQtdRecepcao();
    public List<Integer> getCapacidadeTransCaminhao();
    public int getLimiteSupEsperaNoLagar();
    public int getLimiteInfParaVoltarAOperar();
    
    
}
