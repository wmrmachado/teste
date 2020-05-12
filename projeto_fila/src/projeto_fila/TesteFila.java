package projeto_fila;

public class TesteFila {
	
	public static void main(String[] args) {
		
		ProjetoFila objeto = new ProjetoFila();
		System.out.println(objeto.vazio());
		
		objeto.inserir(18);
		objeto.inserir(20);
		objeto.inserir(44);
		
		System.out.println(objeto.atender());
	}

}
