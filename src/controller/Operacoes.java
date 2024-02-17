package controller;

public class Operacoes {

	public Operacoes() {
		super();
	}

	public void divideFrase01(String frase) {
		int cont = 0;
		String[] vetorPalavra = frase.split(";");
		for (String atual : vetorPalavra) {
			System.out.print(atual + " ");
			cont++;
		}
		System.out.println("\nTotal de divisões do primeiro vetor: " + cont);
		System.out.println("\n==============================================\n");
	}

	public void divideFrase02(String frase) {
		int cont = 0;
		String[] vetorPalavra = frase.split(";");
		for (String atual : vetorPalavra) {
			System.out.print(atual + " ");
			cont++;
		}
		System.out.println("\nTotal de divisões do segundo vetor: " + cont);
		System.out.println("\n==============================================\n");
	}

	public void divideFrase03(String frase) {
		int cont = 0;
		String[] vetorPalavra = frase.split(";");
		for (String atual : vetorPalavra) {
			System.out.print(atual + " ");
			cont++;
		}
		System.out.println("\nTotal de divisões do terceiro vetor: " + cont);
		System.out.println("\n==============================================\n");

	}
}
