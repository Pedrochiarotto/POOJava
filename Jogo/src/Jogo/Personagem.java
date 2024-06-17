package Jogo;

public abstract class Personagem {
    private String nickname;
	private final String nomePersonagem;
	protected float vida;
    protected float forca;
	protected float defesa;
    protected float velocidade;
    protected float magia;
    private float vidaAtual;
	private Item itemAtual;
    private Roupa roupa;


	public Personagem(String nomePersonagem, float vida, float forca, float defesa, float velocidade, float magia) {
		this.nomePersonagem = nomePersonagem;
		this.vida = vida;
		this.forca = forca;
		this.defesa = defesa;
		this.velocidade = velocidade;
		this.magia = magia;
		this.vidaAtual = vida;
	}

	public Personagem(String nome, String nomePersonagem, float vida, float forca, float defesa, float velocidade, float magia) {
		this.nickname = nome;
		this.nomePersonagem = nomePersonagem;
		this.vida = vida;
		this.forca = forca;
		this.defesa = defesa;
		this.velocidade = velocidade;
		this.magia = magia;
		this.vidaAtual = vida;
	}

    public Personagem(String nome, String nomePersonagem, float vida, float forca, float defesa, float velocidade, float magia, Item item) {
        this.nickname = nome;
        this.nomePersonagem = nomePersonagem;
        this.vida = vida;
        this.forca = forca;
        this.defesa = defesa;
        this.velocidade = velocidade;
        this.magia = magia;
        this.vidaAtual = vida;
        
        this.itemAtual = item;
        this.roupa = new Roupa();
    }


    public Personagem(String nome, String nomePersonagem, float vida, float forca, float defesa, float velocidade, float magia, Item item, String estilo, String cor) {
        this.nickname = nome;
        this.nomePersonagem = nomePersonagem;
        this.vida = vida;
        this.forca = forca;
        this.defesa = defesa;
        this.velocidade = velocidade;
        this.magia = magia;
        this.vidaAtual = vida;

        this.itemAtual =item;
        this.roupa = new Roupa(estilo,cor);
    }

	public void comprarItem(Item item) {
		this.itemAtual = item;
	}

	public float getVida() {
		return vida;
	}

	public void setVida(float vida) {
		this.vida = vida;
	}

	public float getForca() {
		return forca;
	}

	public void setForca(float forca) {
		this.forca = forca;
	}

	public float getDefesa() {
		return defesa;
	}

	public void setDefesa(float defesa) {
		this.defesa = defesa;
	}

	public float getVidaAtual() {
		return vidaAtual;
	}

	public void setVidaAtual(float vidaAtual) {
		this.vidaAtual = vidaAtual;
	}

	public String getNickname() {
		return nickname;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}

	public float getMagia() {
		return magia;
	}

	public void setMagia(float magia) {
		this.magia = magia;
	}

	public Item getItemAtual() {
		return itemAtual;
	}

	public void setItemAtual(Item itemAtual) {
		this.itemAtual = itemAtual;
	}

	public String getNomePersonagem() {
		return nomePersonagem;
	}

	public Roupa getRoupa() {
		return roupa;
	}

	public void setRoupa(Roupa roupa) {
		this.roupa = roupa;
	}
}
