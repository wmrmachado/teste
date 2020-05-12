package br.com.itau.implementacao;

import javax.swing.JOptionPane;

import br.com.itau.beans.Bacharelado;
import br.com.itau.beans.Formacao;
import br.com.itau.beans.Medio;
import br.com.itau.beans.Tecnologia;


public class TesteFormacao {
	
	public static String texto(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	
	public static int inteiro(String msg) {
		return Integer.parseInt(texto(msg));
	}
	
	public static double decimal(String msg) {
		return Double.parseDouble(texto(msg));
	}
	public static boolean vf(String msg) {
		return Boolean.parseBoolean(texto(msg));
	}
	
	
	public static void main(String[] args) {
		Formacao objeto = null;
		String resposta = texto("Qual formação deseja cadastrar: ");
		if (resposta.contentEquals("BACHARELADO")){
			objeto = new Bacharelado(
					texto("Digite a Descrição: "),
					inteiro("Digite o Periodo: "),
					0,
					0,
					texto("Digite o Projeto de Conclusao: "),
					inteiro("Digite a Carga Horario do Estagio: ")
					);
			
		}else if(resposta.contentEquals("TECNOLOGIA")) {
			objeto = new Tecnologia(
					texto("Digite a Descrição........: "),
					inteiro("Digite o Periodo........: "),
					0,
					0,
					vf("Digite o Projeto de Conclusao: ")
					);
			
		}else if(resposta.contentEquals("MEDIO")) {
			objeto = new Medio(
					texto("Digite a Descrição....: "),
					inteiro("Digite o Periodo....: "),
					0,
					0,
					texto("Digite o Tipo.........: ")
					);
		}else{
			System.out.println("Opção invalida");
		}
		objeto.definirDuracao();
		objeto.calcularMensalidade(0.15);
		System.out.println(objeto.getAll());
		

	}

}
