package estruturas;

import java.util.List;

public abstract class Lista {
	protected List<Integer> dados;
	
	public int getTamanho() {
		return dados.size();
	}
	
	public abstract int peek();

	@Override
	public String toString() {
		return "" + dados;
	}
}