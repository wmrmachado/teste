package br.com.itau.implementacao;

import javax.swing.JOptionPane;

import br.com.itau.beans.CompactDisc;
import br.com.itau.beans.Livro;
import br.com.itau.beans.Produto;

public class TestePrincipal2 {
	
	public static String texto(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	
	public static int inteiro(String msg) {
		return Integer.parseInt(texto(msg));
	}
	
	public static double decimal(String msg) {
		return Double.parseDouble(texto(msg));
	}
	
	

	public static void main(String[] args) {

		//Livro livro = new Livro();
		//CompactDisc cd = new CompactDisc();
		
		Produto produto = null;
		String resposta = JOptionPane.showInputDialog("Digite: \n<L> para Livro ou \n<C> para CD");
		if (resposta.contentEquals("L")){
			produto = new Livro(
					inteiro("Digite o Codigo: "),
					decimal("Digite o valor: "),
					texto("Digite a descrição do livro: "),
					texto("Digite o ISBN: "),
					texto("Digite o autor: ")
					);
			
		}else if(resposta.contentEquals("C")) {
			produto = new CompactDisc(
					inteiro("Digite o Codigo: "),
					decimal("Digite o valor: "),
					texto("Digite a descrição do livro: "),
					texto("Digite a Gravadora: "),
					texto("Digite artista: ")
					);
		}else{
			System.out.println("Opção invalido");
		}
		
		System.out.println(produto.getAll());
		System.out.println(produto.calcularValorFinal());
				

	}

}
