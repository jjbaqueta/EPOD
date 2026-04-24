package estruturas;

import java.util.ArrayList;

public class Pilha extends Lista {

	public Pilha() {
		this.dados = new ArrayList<Integer>();
	}
	
	public void push(int valor) {
		this.dados.add(valor);
	}
	
	public int pop() {
		return this.dados.remove(this.dados.size() - 1);
	}
	
	@Override
	public int peek() {
		return this.dados.get(this.dados.size() - 1);
	}
}