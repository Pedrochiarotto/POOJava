package Jogo;

public abstract class Personagem {
    private final String nickname;
    private final int vida;
    private final int forca;
    private final int defesa;
    private final int velocidade;
    private final int magia;
    private int vidaAtual;

    public Personagem(String nome,int vida, int forca, int defesa, int velocidade, int magia) {
        this.nickname = nome;
        this.vida = vida;
        this.forca = forca;
        this.defesa = defesa;
        this.velocidade = velocidade;
        this.magia = magia;
        this.vidaAtual = vida;
    }

    public int getVidaAtual() {
        return vidaAtual;
    }

    public void setVidaAtual(int vidaAtual) {
        this.vidaAtual = vidaAtual;
    }

    public String getNickname() {
        return nickname;
    }

    public String getHabilidadeSecundaria() {
        return habilidadeSecundaria;
    }

    public String getHabilidadePrincipal() {
        return habilidadePrincipal;
    }

    public int getVida() {
        return vida;
    }

    public int getForca() {
        return forca;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getMagia() {
        return magia;
    }
}
