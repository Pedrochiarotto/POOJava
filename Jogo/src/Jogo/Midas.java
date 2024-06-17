package Jogo;

public class Midas extends TipoTanque implements IBoss{

	public Midas() {
		super("Midas", 1000,800,500,100, 50);
	}
	
	public void HabilidadePrincipal() {
		System.out.println("Midas utilizou sua habilidade Invulnerável");
	}
	
	public void HabilidadeSecundaria() {
		System.out.println("Midas utilizou sua habilidade Teleporte");
	}


	@Override
	public void armor() {
		this.defesa = defesa +(15*100/defesa);
	}

	@Override
	public void BuffForca() {
		this.forca = forca + (30*100/forca);
	}
	
}