package projeto_Pilha;

public class Pilha {
	private int topo;
	private int vetor[];
	
	public Pilha() {
		vetor = new int [10];
		topo = -1;
	}

	public boolean vazio() {
		return (topo == -1);
// o return feito como acima equivale ao IF/Else abaixo comentado		
//		if (topo == -1) {
//			return true;
//		}else {
//			return false;
//		}
	
	}
	
	public boolean cheio() {
		return (topo == 9);
		
//		if (topo == 9) {
//			return true;
//		}else {
//			return false;
//		}
	}
	
	public void inserir(int valor) {
		if (!cheio()) {
			topo++;
			vetor[topo] = valor;
		}else {
			System.out.println("Pilha cheia");
		}
	}
	
	public int retirar() {
		if(!vazio()) {
			int valor = vetor[topo];
			topo--;
			return valor;
		}
		return -1;
	}


}
