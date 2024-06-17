package Jogo;

public class LeeSin extends TipoLutador implements IHeroi {
	public LeeSin(String nome,Item item) {
		super(nome,"Lee Sin", 400, 200,300,100,0, item);
	}

	@Override
	public void atacar() {
		System.out.println("Lee sin atacou com seu hit básico.");
	}

	@Override
	public void esquivar() {
		System.out.println("Lee sin se esquivou com a habilidade proteger");
	}

	@Override
	public void usarHabilidadePrincipal() {
		System.out.println("Lee sin utilizou sua ultimate Fúria do Dragão.");
	}

	@Override
	public void usarHabilidadeSecundaria() {
		System.out.println("Lee Sin utilizou sua habilidade Onda Sonica.");
	}
}
