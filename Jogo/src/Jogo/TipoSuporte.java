package Jogo;

public class TipoSuporte extends Personagem {

	private String descricao = "Personagens que utilizam suas habilidades mágicas para auxílio de seus companheiros de equipe.";
	public TipoSuporte (String nome, String nomePersonagem, float vida, float forca, float defesa, float velocidade, float magia, Item item) {
		super(nome, nomePersonagem,vida, forca, defesa, velocidade, magia, item);
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
