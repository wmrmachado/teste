package teste;

import javax.swing.JOptionPane;

import modelo.Aluno;
import modelo.Endereco;

public class TesteSetIndividual {

	public static void main(String[] args) {
		
		//-- Retorna todas as informa��es de uma vez
		Aluno objetoAluno = new Aluno();
		
		//-- Retorna informa��o individualmente
		objetoAluno.setNome(JOptionPane.showInputDialog("Digite o nome").toUpperCase());		
		objetoAluno.setNumeroMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da matricula")));				
		objetoAluno.setEmail(JOptionPane.showInputDialog("Digite o email").toLowerCase());
				
		System.out.println("Numero da Matricula : " + objetoAluno.getNumeroMatricula());
		System.out.println("O nome �............: " + objetoAluno.getNome());
		System.out.println("O email �...........: " + objetoAluno.getEmail());
		
		System.out.println("At� logo...");
	}

}
