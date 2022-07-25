package br.com.projetoLetsCode;

public class teste {
	public static void main(String[] args) {
		String data = "22/02/2000";
		
		System.out.println(data.matches("\\s+?\\d{2}\\/\\d{2}\\/\\d{4}"));
	}

}
