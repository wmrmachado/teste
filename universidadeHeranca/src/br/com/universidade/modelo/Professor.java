package br.com.universidade.modelo;

public class Professor extends Pessoa {
	private String apelido;
	private String materia;
	
//======= Construtor Inicio =======================================================
	
	public Professor() {
		super();
	}
	
	public Professor(String nome, String email, String fone, String apelido, String materia) {
		super(nome, email, fone);
		this.apelido = apelido;
		this.materia = materia;
	}
	
//======= Construtor Fim ==========================================================
	
//======= Getters e Setters Inicio ======================================================	

	public String getAll() {
		return apelido + "\n" + materia + "\n" + super.getAll();
	}
	
	public void setAll(String nome, String email, String fone, String apelido, String materia) {
		super.setAll(nome, email, fone);
		this.apelido = apelido;
		this.materia = materia;
	}
	
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	
//======= Getters e Setters Fim ==============================================
	
	

}
