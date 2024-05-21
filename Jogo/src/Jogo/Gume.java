package Jogo;

public class Gume extends Item {
    public Gume() {
        super("Gume do Infinito", 3400, 0, 70, 0, 10, 0);
    }

    @Override
    public void ativarHabilidade() {
        System.out.println("O item Gume do Infinito teve sua habilidade ativada!");
        System.out.println("Estatísticas alteradas: \nForça aumentou + 20\nVelodicade aumentou + 10");
    }
}
