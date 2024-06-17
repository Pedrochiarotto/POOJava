package Jogo;

public class Plankton extends TipoLutador implements IInimigo{
	public Plankton() {
          super("Plankton", 50, 50,50, 350, 0);
	}
	

	@Override
	public void inimigo_atacar() {
		System.out.println("Plankton atacou com seu hit básico.");
	}

	@Override
	public void inimigo_esquivar() {
		System.out.println("Plankton se esquivou com a habilidade Fujão.");
	}

	@Override
	public void inimigo_usarHabilidadePrincipal() {
		System.out.println("Plankton utilizou sua habilidade Invasão.");
	}

	@Override
	public void inimigo_usarHabilidadeSecundaria() {
		System.out.println("Plankton utilizou sua habilidade Mentira");
	}

	@Override
	public void inimigo_usarHabilidadeSecreta() {
		System.out.println("Plankton utilizou sua habilidade secreta e chamou a Karen");
	}
}