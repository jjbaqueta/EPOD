package estruturas;

import java.util.LinkedList;

public class Fila extends Lista {
	
	public Fila() {
		this.dados = new LinkedList<Integer>();
	}
	
	public void enqueue(int valor) {
		this.dados.addLast(valor);
	}
	
	public int dequeue() {
		return this.dados.removeFirst();
	}

	@Override
	public int peek() {
		return this.dados.getFirst();
	}
}