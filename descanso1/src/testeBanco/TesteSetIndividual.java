package testeBanco;

import sistemaBanco.Cliente;
import sistemaBanco.ContaCorrente;
import sistemaBanco.Endereco;

public class TesteSetIndividual {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		Cliente cliente = new Cliente();
		Endereco endereco = new Endereco();
		
		conta.setSaldo(500);
		conta.setTitular(cliente);
		cliente.setCpf("123456");
		cliente.setNome("Wagner");
		cliente.setEndereco(endereco);
		endereco.setBairro("bairro");
		endereco.setCep("1234-000");
		endereco.setComplemento("sem complemento");
		endereco.setNumero((short) 15);
		endereco.setRua("Av. Paulista");
		
		System.out.println(conta.getAll());
	}

}
