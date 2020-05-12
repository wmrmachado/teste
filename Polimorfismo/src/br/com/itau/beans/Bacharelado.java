package br.com.itau.beans;

import br.com.itau.interfaces.PadraoFormacao;

public class Bacharelado extends Formacao implements PadraoFormacao{
	private String projetoConclusao = new String();
	private int cargaHorarioEstagio;
	
	// para criar o metodo calcularMensalidade usamos o metodo Plimorfismo override
	public void calcularMensalidade(double fator) {
		super.setMensalidade(super.getDuracao() * fator * 600 + cargaHorarioEstagio*12);
	}
	
	
	
	
//Contrutor inicio =======================================
	
	public Bacharelado() {
		super();
	}


	public Bacharelado(String descricao, int periodo, double mensalidade, int duracao, String projetoConclusao,
			int cargaHorarioEstagia) {
		super(descricao, periodo, mensalidade, duracao);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorarioEstagio = cargaHorarioEstagia;
	}
	
//Contrutor inicio =======================================
	
//Getters e Setters inicio =======================================
	
	public String getAll() {
		return projetoConclusao + "\n" + cargaHorarioEstagio + "\n" + super.getAll();
	}
	
	public void setAll(String descricao, int periodo, double mensalidade, int duracao, String projetoConclusao,
			int cargaHorarioEstagia) {
		super.setAll(descricao, periodo, mensalidade, duracao);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorarioEstagio = cargaHorarioEstagia;
	}
	


	public String getProjetoConclusao() {
		return projetoConclusao;
	}


	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}


	public int getCargaHorarioEstagia() {
		return cargaHorarioEstagio;
	}


	public void setCargaHorarioEstagia(int cargaHorarioEstagia) {
		this.cargaHorarioEstagio = cargaHorarioEstagia;
	}
	
	
	
	

}