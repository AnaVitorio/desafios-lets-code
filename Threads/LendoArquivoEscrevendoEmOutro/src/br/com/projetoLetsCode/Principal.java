package br.com.projetoLetsCode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		String pathArquivo = "regras.txt";
		String pathArquivoEscrever = "LendoArquivoEscrevendoEmOutro";
		
		Thread threadLeitor = new Thread(new Leitor(pathArquivo));
		
		
		
		threadLeitor.start();
		
		CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> leitor(pathArquivo));
	    while (!completableFuture.isDone()) {
	        System.out.println("CompletableFuture is not finished yet...");
	    }
	    String result = completableFuture.get();
	    System.out.println(result);
	    
	    Thread threadEscritor = new Thread(new Escritor(pathArquivoEscrever, result));
		
	}
	
	public static String leitor(String path) {
		String data = "\\s+?\\d{2}\\/\\d{2}\\/\\d{4}";

		try (Stream<String> stream = Files.lines(Paths.get(path))) {
		       List<String> listaData = stream.filter(linha -> linha.matches(data))
		       		.collect(Collectors.toList());
		       return listaData.get(0);
			} catch (IOException e) {
				e.printStackTrace();
				return e.getMessage();
			}

		
	}
	

}