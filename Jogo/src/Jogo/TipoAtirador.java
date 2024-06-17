package Jogo;

public class TipoAtirador extends Personagem {

	private String descricao = "Personagem que ataca a distância, geralmente com foco em precisão e longo alcance.";
	
	public TipoAtirador(String nome, String nomePersonagem, float vida, float forca, float defesa, float velocidade, float magia,Item item, String estilo, String cor) {
		super(nome, nomePersonagem, vida, forca, defesa, velocidade, magia, item, estilo, cor);
		
	}
	
	public TipoAtirador(String nome, String nomePersonagem, float vida, float forca, float defesa, float velocidade, float magia,Item item) {
		super(nome, nomePersonagem, vida, forca, defesa, velocidade, magia, item);
	}
	
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
