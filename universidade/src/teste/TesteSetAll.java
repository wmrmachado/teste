package teste;

import modelo.Aluno;
import modelo.Endereco;

public class TesteSetAll {

	public static void main(String[] args) {
		
		//-- Retorna todas as informa��es de uma vez
		Endereco objetoEndereco = new Endereco();
		Aluno objetoAluno = new Aluno();
		
		
		objetoEndereco.setAll("RUA XPTO", "419", "ROSA DE FRANCA", "GUARULHOS", "SP", "12345-123");
		objetoAluno.setAll("Wagner",  2611, "wagner@itau", objetoEndereco);
		
		System.out.println(objetoAluno.getAll());
		System.out.println("At� logo...");
	}

}
