package br.com.alura.threads;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TarefaBuscaTextual implements Runnable {

	private String path;
	private String nome;

	public TarefaBuscaTextual(String path, String nome) {
		this.path = path;
		this.nome = nome;
		
	}

	@Override
	public void run() {
		try {
			Scanner scanner = new Scanner(new File(path));
			
			int numeroLinha = 1;
			
			while(scanner.hasNextLine()) {
				String linha = scanner.nextLine();
				
				if(linha.toLowerCase().contains(nome.toLowerCase())) {
					System.out.println(path+" - "+numeroLinha+" - "+linha);
				}
				
				numeroLinha++;
			}
			
			scanner.close();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);		}

	}

}
