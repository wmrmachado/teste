package testeBanco;

import sistemaBanco.Cliente;
import sistemaBanco.ContaCorrente;
import sistemaBanco.Endereco;

public class TesteSetAll {

	public static void main(String[] args) {
			
			ContaCorrente conta = new ContaCorrente();
			Cliente cliente = new Cliente();
			Endereco endereco = new Endereco();
						
			conta.setAll(500,  cliente);
			cliente.setAll("XPTO", "1234567", endereco);
			endereco.setAll("ruax", (short) 1, "apto 10", "centro", "07081-000");
			
			System.out.println(conta.getAll());
			
	}

}
