package Jogo;

public class Jett extends Personagem implements IHeroi {
	public Jett(String nome, Item item) {
		super(nome, "Jett", 150, 150, 200, 400, 100, item);
	}

	@Override
	public void atacar() {
		System.out.println("Jett atacou com seu hit básico.");
	}

	@Override
	public void esquivar() {
		System.out.println("Jett se esquivou com a habilidade Corrente Ascendente");
	}

	@Override
	public void usarHabilidadePrincipal() {
		System.out.println("Jett utilizou sua habilidade Brisa de Impulso.");
	}

	@Override
	public void usarHabilidadeSecundaria() {
		System.out.println("Jett utilizou sua habilidade Erupção das Brumas.");
	}
}