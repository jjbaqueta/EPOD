public abstract class Personagem {
	protected String nome;
	protected Integer vida;
	protected Integer vidaMaxima;
	protected Integer forca;
	
	public Personagem(String nome, int vida, int forca) {
		super();
		this.nome = nome;
		this.vida = vida;
		this.vidaMaxima = vida;
		this.forca = forca;
	}

	public String getNome() {
		return nome;
	}

	public Integer getVida() {
		return vida;
	}
	
	public Integer getVidaMaxima() {
		return vidaMaxima;
	}
	
	public Integer getForca() {
		return forca;
	}

	public void receberDano(int dano) {
		this.vida -= dano;
		
		if (this.vida < 0) {
			this.vida = 0;
		}
	}
	
	public void exibirVida() {
		System.out.println(this.nome + ", vida atual: " + this.vida);
	}
	
	public abstract int atacar();

	@Override
	public String toString() {
		return "Personagem [nome=" + nome + ", vida=" + vida + ", vidaMaxima=" + vidaMaxima + ", forca=" + forca + "]";
	}
}