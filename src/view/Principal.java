package view;

import controller.Operacoes;

/*
  	Fazer uma aplicação Java em Eclipse que tenha uma operação que se permita entrar com um
	texto, conforme exemplo abaixo, por Scanner ou JOptionPane, divida o texto em partes, com
	split e exiba quantas partes aquele texto tem. A aplicação deve ter uma classe de controle
	com métodos para operações e uma classe de visão que instancie a classe de controle para
	a comunicação, A resposta da tarefa deve ser o print do console com as quantidades.

	Texto 1: abóbora;abobrinha;alcachofra;aspargos;batata-doce;berinjela;beterraba
	Texto 2: abacate;ameixa;amora;banana;cajá;figo;maçã;melancia;uva;seriguela
	Texto 3: acelga;alface;alho-poró;coentro;endívia;escarola;repolho;rúcula
 */

public class Principal {
	public static void main(String[] args) {
		Operacoes op = new Operacoes();

		String frase01 = "abóbora;abobrinha;alcachofra;aspargos;batata-doce;berinjela;beterraba";
		String frase02 = "abacate;ameixa;amora;banana;cajá;figo;maçã;melancia;uva;seriguela";
		String frase03 = "acelga;alface;alho-poró;coentro;endívia;escarola;repolho;rúcula";
		
		op.divideFrase01(frase01);
		op.divideFrase02(frase02);
		op.divideFrase03(frase03);
	}
}
