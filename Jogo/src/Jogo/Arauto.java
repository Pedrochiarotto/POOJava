package Jogo;

public class Arauto extends Personagem implements IInimigo{
	
	public Arauto(String nome, float vida, float forca, float defesa, float velocidade, float magia) {
		super(nome, vida, forca, defesa, velocidade, magia);
		
	}

	@Override
	public void usarHabilidadeSecreta() {
		System.out.println("Arautou agarra seu adversário e o joga contra parede");
		
	}
	@Override
	public void atacar() {
		System.out.println("Arauto utilizou seu ataque basico");
		
	}

	@Override
	public void esquivar() {
		System.out.println("Arautou desviou com um salto para o lado");
		
	}

	@Override
	public void usarHabilidadePrincipal() {
		System.out.println("Arauto cabeceou com uma poderosa investida");
		
	}

	@Override
	public void usarHabilidadeSecundaria() {
		System.out.println("Arauto atacou com um soco forte");
	}
	
}
