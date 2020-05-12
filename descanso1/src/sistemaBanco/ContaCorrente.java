package sistemaBanco;


public class ContaCorrente {
	private double saldo;
	private Cliente titular;
	
	//Construtores	
	public ContaCorrente() {
		super();
	}

	public ContaCorrente(double saldo, Cliente titular) {
		super();
		this.saldo = saldo;
		this.titular = titular;
	}

	//Getters e Setters
	public void setAll(double saldo, Cliente titular) {
		this.saldo = saldo;
		this.titular = titular;
	}
	
	public String getAll() {
		return saldo + "\n" + titular.getAll();
	}
	
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	
}
