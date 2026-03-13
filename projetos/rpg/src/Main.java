public class Main {

	public static void main(String[] args) {
		// Criando as instâncias
		Guerreiro inimigo = new Guerreiro("Balrog", 500, 5);
		Guerreiro g1 = new Guerreiro("Aragorn", 100, 2);
		Guerreiro g2 = new Guerreiro("Gimili", 100, 3);
		Mago m1 = new Mago("Gandalf", 50, 1, 5);

		// Exibindo os personagens
		System.out.println(inimigo);
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(m1);
		
		System.out.println("Turno 1 ...");
		inimigo.receberDano(g1.atacar());
		inimigo.receberDano(g2.atacar());
		inimigo.receberDano(m1.atacar());
		inimigo.exibirVida();
		
		g1.receberDano(inimigo.atacar());
		g1.exibirVida();
		
		System.out.println("Turno 2 ...");
		g1.receberCura(m1.curar());
		inimigo.receberDano(g2.atacar());
		inimigo.exibirVida();
		
		m1.receberDano(inimigo.atacar());
		m1.exibirVida();
	}
}