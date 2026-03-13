public class Guerreiro extends Personagem implements Curavel {

	public Guerreiro(String nome, int vida, int forca) {
		super(nome, vida, forca);
	}

	@Override
	public void receberCura(Integer pontosDeCura) {
		this.vida += pontosDeCura;

        if (this.vida > this.vidaMaxima) {
            this.vida = this.vidaMaxima;
        }
        System.out.println(this.nome + " foi curado! vida atual: " + this.vida + "/" + this.vidaMaxima);
	}

	@Override
	public int atacar() {
		int dano = 10 * this.forca;
		System.out.println(this.nome + " atacou com dano de " + dano);
		return dano;
	}
}