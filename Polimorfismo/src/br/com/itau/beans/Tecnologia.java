package br.com.itau.beans;

import br.com.itau.interfaces.PadraoFormacao;

public class Tecnologia extends Formacao implements PadraoFormacao{
	private boolean planoEstendido;
	
	// para criar o metodo calcularMensalidade usamos o metodo Plimorfismo override
	public void calcularMensalidade(double fator) {
		super.setMensalidade(super.getDuracao() * fator * 600);
	}
	
	
	
//Contrutor inicio =======================================
	public Tecnologia() {
		super();
	}

	public Tecnologia(String descricao, int periodo, double mensalidade, int duracao, boolean planoEstendido) {
		super(descricao, periodo, mensalidade, duracao);
		this.planoEstendido = planoEstendido;
	}
	
//Contrutor Fim =======================================
	
//Getters e Setters inicio =======================================
	
	public String GetAll() {
		return planoEstendido + "\n" + super.getAll();
	}
	
	public void setAll(String descricao, int periodo, double mensalidade, int duracao, boolean planoEstendido) {
		super.setAll(descricao, periodo, mensalidade, duracao);
		this.planoEstendido = planoEstendido;
	}

	public boolean isPlanoEstendido() {
		return planoEstendido;
	}

	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	}
	
	
	

}
