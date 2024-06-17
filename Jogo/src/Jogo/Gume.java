package Jogo;

public class Gume extends Item {
    public Gume() {
        super("Gume do Infinito", 3400, 0, 70, 0, 10, 0);
    }

    @Override
    public void ativarHabilidade() {
        super.ativarHabilidade();
        System.out.println("Estatísticas alteradas: \nForça aumentou + 200\nVelodicade aumentou + 100");
        this.forca = this.forca + 200;
        this.velocidade = this.velocidade + 100;
    }
}
