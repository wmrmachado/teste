package br.com.itau.implementacao;

import javax.swing.JOptionPane;

import br.com.itau.beans.CompactDisc;
import br.com.itau.beans.Livro;
import br.com.itau.beans.Produto;

public class TestePrincipal {
	
	public static String texto(String msg) {
		return JOptionPane.showInputDialog("msg").toUpperCase();
	}
	
	public static int inteiro(String msg) {
		return Integer.parseInt(texto(msg));
	}
	
	public static double decimal(String msg) {
		return Double.parseDouble(texto(msg));
	}
	
	

	public static void main(String[] args) {
//		Livro livro = new Livro(
//				Integer.parseInt(JOptionPane.showInputDialog("Digite o Codigo: ")),
//				Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: ")),
//				JOptionPane.showInputDialog("Digite a descri��o do livro: ").toUpperCase(),
//				JOptionPane.showInputDialog("Digite o ISBN: ").toUpperCase(),
//				JOptionPane.showInputDialog("Digite o autor: ").toUpperCase()
//				);
//		System.out.println(livro.getAll());
		
//		CompactDisc disc = new CompactDisc(
//				5678,
//				10.50,
//				"CD Java",
//				"Gravadora Sony",
//				"Artista XPTO"
//				);
//		System.out.println("\n" + disc.getAll());
		
		Livro livro = new Livro();
		CompactDisc cd = new CompactDisc();
		String resposta = JOptionPane.showInputDialog("Digite: \n<L> para Livro ou \n<C> para CD");
		if (resposta.contentEquals("L")){
			livro.setAll(
					Integer.parseInt(JOptionPane.showInputDialog("Digite o Codigo: ")),
					Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: ")),
					JOptionPane.showInputDialog("Digite a descri��o do livro: ").toUpperCase(),
					JOptionPane.showInputDialog("Digite o ISBN: ").toUpperCase(),
					JOptionPane.showInputDialog("Digite o autor: ").toUpperCase()
					);
			System.out.println(livro.getAll());
			System.out.println(livro.calcularValorFinal());
			
		}else if(resposta.contentEquals("C")) {
			cd.setAll(
					inteiro("Digite o Codigo: "),
					decimal("Digite o valor: "),
					texto("Digite a descri��o do livro: "),
					texto("Digite a Gravadora: "),
					texto("Digite artista: ")
					);
			System.out.println(cd.getAll());
			System.out.println(cd.calcularValorFinal());
		}else{
			System.out.println("Op��o invalido");
		}
		
				
		//    n�o pode ser feito pois a classe Pai � abstrata 
		//Produto objeto = new Produto();
		
		//    Desta maneira podemos criar um objeto do tipo produto pois configuramos ele como CompactDisc
		//Produto produto;
		//produto = new CompactDisc();
		
		
		

	}

}
