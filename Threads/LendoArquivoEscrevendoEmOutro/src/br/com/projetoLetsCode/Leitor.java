package br.com.projetoLetsCode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Leitor implements Runnable {

	private String pathArquivo;

	public Leitor(String pathArquivo) {
		this.pathArquivo = pathArquivo;
		
	}

	
	@Override
	public void run() {
		String data = "\\s+?\\d{2}\\/\\d{2}\\/\\d{4}";
		
		try (Stream<String> stream = Files.lines(Paths.get(pathArquivo))) {
		       stream.filter(linha -> linha.matches(data))
		       .forEach(linhaData -> System.out.println(linhaData.trim()));
			} catch (IOException e) {
				e.printStackTrace();
			}

	    }


}
