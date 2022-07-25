package br.com.alura;

public class Principal {
	public static void main(String[] args) {
		ImprimeString string = new ImprimeString();
		Thread stringThread = new Thread(string);
		stringThread.start();
	}
}
