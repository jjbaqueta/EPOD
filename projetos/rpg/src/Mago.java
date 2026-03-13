public class Mago extends Personagem {
	private Integer mana;

	public Mago(String nome, int vida, int forca, int mana) {
		super(nome, vida, forca);
		this.mana = mana;
	}
	
	public Integer getMana() {
		return this.mana;
	}
	
	public int curar() {
		int pontosDeCura = 1 * mana;
		System.out.println(this.nome + ", enviou pontos de cura: " + pontosDeCura);
		return pontosDeCura;
	}

	@Override
	public int atacar() {
		int dano = 15 * this.mana;
		System.out.println(this.nome + " atacou com dano de " + dano);
		return dano;
	}

	@Override
	public String toString() {
		return "Mago [nome=" + nome + ", mana=" + mana + ", vida=" + vida + ", vidaMaxima=" + vidaMaxima + ", forca="
				+ forca + "]";
	}
}