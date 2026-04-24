package estruturas;

public class Main {

	public static void main(String[] args) {
		Fila fila = new Fila();
		Pilha pilha = new Pilha();
		
		System.out.println("Dados da fila:");
		
		// Adicionando elementos da fila
		fila.enqueue(1);
		fila.enqueue(2);
		fila.enqueue(10);
		fila.enqueue(50);
		System.out.println(fila);
		
		// Exibindo o relatório
		while(fila.getTamanho() > 0) {
			System.out.println("valor removido: " + fila.dequeue());
			System.out.println(fila);
		}
		
		System.out.println("\nDados da pilha:");
		
		// Adicionando elementos da pilha
		pilha.push(1);
		pilha.push(2);
		pilha.push(10);
		pilha.push(50);
		System.out.println(pilha);
		
		// Exibindo o relatório
		while (pilha.getTamanho() > 0) {
			System.out.println("valor removido: " + pilha.pop());
			System.out.println(pilha);
		}
	}
}