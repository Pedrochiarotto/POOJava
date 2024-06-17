package Jogo;

public class TipoMago extends Personagem {

	private String descricao = "É um personagem que ataca utilizando de magia, seu alcance pode ser próximo ou longo dependendo do tipo de magia utilizado.";

	public TipoMago(String nome, String nomePersonagem, float vida, float forca, float defesa, float velocidade, float magia, Item item) {
		super(nome, nomePersonagem, vida, forca, defesa, velocidade, magia, item);
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
