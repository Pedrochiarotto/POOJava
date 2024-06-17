package Jogo;

public class Arauto extends TipoTanque implements IInimigo{
	
	public Arauto() {
		super("Arauto", 150, 100, 200, 50, 0);
		
	}

	@Override
	public void inimigo_usarHabilidadeSecreta() {
		System.out.println("Arautou agarra seu adversário e o joga contra parede");

	}

	@Override
	public void inimigo_atacar() {
		System.out.println("Arauto utilizou seu ataque basico");
		
	}

	@Override
	public void inimigo_esquivar() {
		System.out.println("Arautou desviou com um salto para o lado");
		
	}

	@Override
	public void inimigo_usarHabilidadePrincipal() {
		System.out.println("Arauto cabeceou com uma poderosa investida");
	}

	@Override
	public void inimigo_usarHabilidadeSecundaria() {
		System.out.println("Arauto atacou com um soco forte");
	}
}
