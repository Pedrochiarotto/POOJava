package Jogo;

public class Roupa {
	
	private String estilo;
	private String cor;
	
	public Roupa()
	{
		this.estilo="Padrão";
		this.cor="Padrão";
	}
	
	public Roupa(String estilo, String cor) {
		this.estilo = estilo;
		this.cor = cor;
	}
	
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public static void estiloPadrao()
	{
		System.out.print("Estilo padrão é a roupa padrão do personagem");
	}
	
	public static void estiloDark()
	{
		System.out.print("O estilo dark caracteriza-se por trajes com pontas, personagens com cabelos espetados e coloridos, sendo um estilo voltado para o radical.");
	}
	
	public static void estiloFuturistico()
	{
		System.out.print("O estilo futurístico é definido por trajes metálicos, personagens com óculos espelhados, e alguns LEDs incorporados às roupas.");
	}
	public static void estiloFofo()
	{
		System.out.print("O estilo fofo é representado por trajes de bichinhos que variam conforme o personagem, podendo também incluir roupas com motivos de coração ou nuvem. Este estilo dispensa comentários :).");
	}
	
	

}
