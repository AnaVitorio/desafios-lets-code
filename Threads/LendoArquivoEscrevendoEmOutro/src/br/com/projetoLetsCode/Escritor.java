package br.com.projetoLetsCode;

public class Escritor implements Runnable {

	private String pathArquivoEscrever;
	private String frase;

	public Escritor(String pathArquivoEscrever, String frase) {
		this.pathArquivoEscrever = pathArquivoEscrever;
		this.frase = frase;
		
	}
	@Override
	public void run() {
		
	}
	
	
	
	
}
