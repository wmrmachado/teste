package br.com.itau.beans;

import br.com.itau.interfaces.PadraoFormacao;

public class Medio extends Formacao implements PadraoFormacao{
	private String tipo = new String();
	
	
	// para criar o metodo calcularMensalidade usamos o metodo Plimorfismo override
	public void calcularMensalidade(double fator) {
		super.setMensalidade(super.getDuracao() * fator * 500);
	}
	
	
	

//Contrutor inicio =======================================
	public Medio() {
		super();
	}

	public Medio(String descricao, int periodo, double mensalidade, int duracao, String tipo) {
		super(descricao, periodo, mensalidade, duracao);
		this.tipo = tipo;
	}
// Construtor Fim ====================================================
	
//Getters e Setters inicio ===========================================
	
	public String getAll() {
		return tipo + "\n" + super.getAll();
	}
	
	public void setAll(String descricao, int periodo, double mensalidade, int duracao, String tipo) {
		super.setAll(descricao, periodo, mensalidade, duracao);
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	

}
