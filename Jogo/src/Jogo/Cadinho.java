package Jogo;

public class Cadinho extends Item {
    public Cadinho() {
        super("Cadinho de Mikael", 2900, 300, 15, 30, 10, 10);
    }

    @Override
    public void ativarHabilidade() {
        super.ativarHabilidade();
        System.out.println("Estatísticas alteradas: \nDefesa aumentou + 150\nVelodicade aumentou + 100");
        this.defesa = this.defesa + 150;
        this.velocidade = this.velocidade + 100;
    }
}
