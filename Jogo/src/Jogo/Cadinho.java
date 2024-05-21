package Jogo;

public class Cadinho extends Item {
    public Cadinho() {
        super("Cadinho de Mikael", 2900, 300, 15, 30, 10, 10);
    }

    @Override
    public void ativarHabilidade() {
        System.out.println("O item Gume do Infinito teve sua habilidade ativada!");
        System.out.println("Estatísticas alteradas: \nDefesa aumentou + 35\nVelodicade aumentou + 5");
    }
}
