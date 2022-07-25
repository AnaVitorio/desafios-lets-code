package br.com.alura.threads;

public class ImprimeNumeros implements Runnable {

	
	@Override
	public void run() {
		Thread threadAtual = Thread.currentThread();
		long id = threadAtual.getId();
		for(int i = 0; i <=10; i++) {
			System.out.println("Id da thread: " + id +"Número: "+ i);
		}

	}

}
