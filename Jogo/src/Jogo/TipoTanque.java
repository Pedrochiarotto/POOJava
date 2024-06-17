package Jogo;

public class TipoTanque extends Personagem {

	private String descricao = "São personagens mais resistentes e com maior quantidade de vida, normalmente mais lentos";

	public TipoTanque(String nomePersonagem,float vida, float forca, float defesa, float velocidade, float magia)  {
		super(nomePersonagem, vida, forca, defesa, velocidade, magia);
	}

	public TipoTanque(String nome, String nomePersonagem,float vida, float forca, float defesa, float velocidade, float magia)  {
		super(nome, nomePersonagem, vida, forca, defesa, velocidade, magia);
	}

	public TipoTanque(String nome, String nomePersonagem, float vida, float forca, float defesa, float velocidade, float magia,Item item)  {
		super(nome, nomePersonagem, vida, forca, defesa, velocidade, magia, item);
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
