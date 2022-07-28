import java.util.List;
import java.util.Map;

public class Leitor extends LeitorStrategy{
	private String pathArquivo = "src\\regras.txt";
    private String data = getData(pathArquivo);
    private int quantiPlantacos = getQuantidadePlantacoes(pathArquivo);
    private int quantiVariedades = getQuantidadeVariedade(pathArquivo);
    private Map<String, Integer> variedadeEDits = getVariedadeEDist(pathArquivo);
    private Map<String, Integer> variedadeEQtd = getVariedadeEQtd(pathArquivo);
    private int qtdRecepcao = getQtdRecepcao(pathArquivo);
	private List<Integer> capacidadeTransCaminhao = getCapacidadeTransCaminhao(pathArquivo);
	private int limiteSupEsperaNoLagar = getLimiteSupEsperaNoLagar(pathArquivo);
	private int limiteInfParaVoltarAOperar = getLimiteInfParaVoltarAOperar(pathArquivo);

    // public Leitor(String pathArquivo) {
    //     this.pathArquivo = pathArquivo;
    // }
	
	    
	

}