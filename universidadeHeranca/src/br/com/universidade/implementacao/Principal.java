package br.com.universidade.implementacao;

import br.com.universidade.modelo.Aluno;

public class Principal {

	public static void main(String[] args) {
		Aluno aluno = new Aluno("Wagner", "wmr@", "9999-9999", 12345, "M�e");
		//aluno.setAll("Wagner", "wmr@", "9999-9999", 12345, "M�e");
		
		System.out.println(aluno.getAll());

	}

}
