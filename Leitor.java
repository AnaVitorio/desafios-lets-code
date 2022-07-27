
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Leitor extends LeitorStrategy implements Runnable {

	private String pathArquivo;

	public Leitor(String pathArquivo) {
		this.pathArquivo = pathArquivo;
		
	}

	
	@Override
	public void run() {
		String data = "\\s+?\\d{2}\\/\\d{2}\\/\\d{4}";
		String dataStrategy = getData(pathArquivo);
		int quantiVariedades = getQuantidadeVariedade(pathArquivo);
		int quantiPlantacos = getQuantidadePlantacoes(pathArquivo);
		Map<String, Integer> variedadeEQtd = getVariedadeEQtd(pathArquivo);
		Map<String, Integer> variedadeEDits = getVariedadeEDist(pathArquivo);
		int qtdRecepcao = getQtdRecepcao(pathArquivo);

		
		System.out.println(dataStrategy);
		System.out.println(quantiVariedades);
		System.out.println(quantiPlantacos);

		for (String key : variedadeEQtd.keySet()) {
            int value = variedadeEQtd.get(key);
            System.out.println(key + " = " + value);
		
		}
		System.out.println();
		for (String key : variedadeEDits.keySet()) {
            int value = variedadeEDits.get(key);
            System.out.println(key + " = " + value);
		
		}

		System.out.println(qtdRecepcao);
		List<Integer> capacidadeTransCaminhao = getCapacidadeTransCaminhao(pathArquivo);
		System.out.println(capacidadeTransCaminhao);
		int limiteSupEsperaNoLagar = getLimiteSupEsperaNoLagar(pathArquivo);
		System.out.println(limiteSupEsperaNoLagar);
		int limiteInfParaVoltarAOperar = getLimiteInfParaVoltarAOperar(pathArquivo);
		System.out.println(limiteInfParaVoltarAOperar);

	    
	}

}