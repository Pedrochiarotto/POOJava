package Jogo;

public class Item {
    private String nome;
    private double preco;
    protected double vida;
    protected double forca;
    protected double defesa;
    protected double velocidade;
    protected double magia;
    
    public Item() {
        this.nome = "Pedra do Personagem";
        this.preco = 0;
        this.vida = 1;
        this.forca = 1;
        this.defesa = 1;
        this.velocidade = 1;
        this.magia = 1;
    }
    
    public Item(String nome, double preco, double vida, double forca, double defesa, double velocidade, double magia) {
        this.nome = nome;
        this.preco = preco;
        this.vida = vida;
        this.forca = forca;
        this.defesa = defesa;
        this.velocidade = velocidade;
        this.magia = magia;
    }
    
    public void ativarHabilidade() {
        System.out.println("O item " + this.nome + " ativou sua habilidade!");
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getForca() {
        return forca;
    }

    public void setForca(double forca) {
        this.forca = forca;
    }

    public double getDefesa() {
        return defesa;
    }

    public void setDefesa(double defesa) {
        this.defesa = defesa;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getMagia() {
        return magia;
    }

    public void setMagia(double magia) {
        this.magia = magia;
    }
}
