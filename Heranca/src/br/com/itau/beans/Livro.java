package br.com.itau.beans;

public class Livro extends Produto {
	private String isbn;
	private String autor;

//===== Construtores inicio ==========================================
	
	public Livro() {
		super();
	}

	public Livro(int codigo, double preco, String descricao, String isbn, String autor) {
		super(codigo, preco, descricao);
		this.isbn = isbn;
		this.autor = autor;
	}
	
	public double calcularValorFinal() {
		return super.getPreco() * 1.05;
	}
	
//===== Construtores Fim ==============================================
	
//===== Getters e Setters inicio ======================================

	public String getAll() {
		return isbn + "\n" + autor + "\n" + super.getAll();
	}
	
	public void setAll(int codigo, double preco, String descricao, String isbn, String autor) {
		super.setAll(codigo, preco, descricao);
		this.isbn = isbn;
		this.autor = autor;
	}
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
//===== Getters e Setters Fim ============================================	

}
