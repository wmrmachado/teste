package teste;

import javax.swing.JOptionPane;

import modelo.Aluno;
import modelo.Endereco;

public class TesteSetIndividual {

	public static void main(String[] args) {
		
		//-- Retorna todas as informações de uma vez
		Aluno objetoAluno = new Aluno();
		
		//-- Retorna informação individualmente
		objetoAluno.setNome(JOptionPane.showInputDialog("Digite o nome").toUpperCase());		
		objetoAluno.setNumeroMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da matricula")));				
		objetoAluno.setEmail(JOptionPane.showInputDialog("Digite o email").toLowerCase());
				
		System.out.println("Numero da Matricula : " + objetoAluno.getNumeroMatricula());
		System.out.println("O nome é............: " + objetoAluno.getNome());
		System.out.println("O email é...........: " + objetoAluno.getEmail());
		
		System.out.println("Até logo...");
	}

}
