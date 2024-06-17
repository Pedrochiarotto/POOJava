package Jogo;

public class TipoLutador extends Personagem {

	private String descricao = "Personagem de curto alcance, normalmente se utiliza do corpo, como chutes e socos para atacar.";

	public TipoLutador(String nomePersonagem, float vida, float forca, float defesa, float velocidade, float magia) {
		super(nomePersonagem, vida, forca, defesa, velocidade, magia);
	}

	public TipoLutador(String nome, String nomePersonagem, float vida, float forca, float defesa, float velocidade, float magia,Item item) {
		super(nome, nomePersonagem, vida, forca, defesa, velocidade, magia, item);
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
