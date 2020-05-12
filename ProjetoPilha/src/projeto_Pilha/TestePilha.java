package projeto_Pilha;

public class TestePilha {
	public static void main(String[] args) {
		Pilha idades = new Pilha();
		
		System.out.println("Vazio? " + idades.vazio());
		System.out.println("Cheio? " + idades.cheio());
		
		System.out.println(idades.retirar());
		idades.inserir(50);
		idades.inserir(60);
		idades.inserir(70);
		idades.inserir(80);
		idades.inserir(90);
		idades.inserir(20);
				
		System.out.println(idades.retirar());
		System.out.println(idades.retirar());
		
	}

}
