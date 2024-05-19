package Jogo;

public class Baron extends Personagem implements IBoss{
	public int invocar;
	public Baron(String nome, float vida, float forca, float defesa, float velocidade, float magia,int invocar) {
		super(nome,670,311,200,7,59);
		this.invocar = invocar;
		
	}
	

	
    
	public void HabilidadePrincipal() {
		System.out.println("Baron utilizou Sua habilidade Desparo ácido");
	}
	
	public void HabilidadeSecundaria() {
		System.out.println("Baron utilizou sua habilidade Corrosão");
	}
	
	public void invocacao() {
		System.out.println("Baron invocou " + invocar + " Súditos");
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
