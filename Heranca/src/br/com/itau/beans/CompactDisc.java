package br.com.itau.beans;

public class CompactDisc extends Produto {
	private String gravadora;
	private String artista;
	
	
	public double calcularValorFinal() {
		return super.getPreco() * 1.15;
	}
	
	
//===== Construtores inicio ======================================
	
	public CompactDisc() {
		super();
	}
	
	public CompactDisc(int codigo, double preco, String descricao, String gravadora, String artista) {
		super(codigo, preco, descricao);
		this.gravadora = gravadora;
		this.artista = artista;
	}

	
//===== Construtores Fim ======================================	

//===== Getters e Setters inicio ======================================
	
	public String getAll() {
		return gravadora + "\n" + artista + "\n" + super.getAll();
	}
	
	public void setAll(int codigo, double preco, String descricao, String gravadora, String artista) {
		super.setAll(codigo, preco, descricao);
		this.gravadora = gravadora;
		this.artista = artista;
	}
	
	
	public String getGravadora() {
		return gravadora;
	}

	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	
//===== Getters e Setters Fim ======================================	

}
