package Jogo;

public class Baron extends TipoTanque implements IBoss{
	public int invocar;
	
	public Baron(int invocar) {
		super("Baron", 700,400,400,100,400);
		this.invocar = invocar;
		
	}
	public void HabilidadePrincipal() {
		System.out.println("Baron utilizou sua habilidade Desparo ácido");
	}
	
	public void HabilidadeSecundaria() {
		System.out.println("Baron utilizou sua habilidade Corrosão");
	}
	
	public void invocacao() {
		System.out.println("Baron invocou " + invocar + " Súditos");
		this.forca = 10 * invocar;
	}

	@Override
	public void armor() {
		this.defesa = defesa +(10*100/defesa);	
	}
	
	@Override
	public void BuffForca() {
		this.forca = forca + (3*100/forca);  
	}
	
}
