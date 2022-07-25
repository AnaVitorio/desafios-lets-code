package br.com.alura.threads;

public class PrincipalNumeros {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new ImprimeNumeros());
		Thread thread2 = new Thread(new ImprimeNumeros());
		
		thread1.start();
		thread2.start();

	}
}
