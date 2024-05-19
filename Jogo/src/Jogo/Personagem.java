package Jogo;

public abstract class Personagem {
    private final String nickname;
    protected float vida;
    protected float forca;
    protected float defesa;
    private final float velocidade;
    private final float magia;
    private float vidaAtual;

    public Personagem(String nome,float vida, float forca, float defesa, float velocidade, float magia) {
        this.nickname = nome;
        this.vida = vida;
        this.forca = forca;
        this.defesa = defesa;
        this.velocidade = velocidade;
        this.magia = magia;
        this.vidaAtual = vida;
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

	public float getMagia() {
		return magia;
	}

   
}
