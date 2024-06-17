package Jogo;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo, digite seu nome: ");
        String nome_usuario = input.nextLine();
        Item itemPadrao = new Item();
        FuncoesPlayer funcoes = new FuncoesPlayer();

        ArrayList<Personagem> herois = new ArrayList<Personagem>();
        Personagem Ashe = new Ashe(nome_usuario, itemPadrao);
        Personagem Jett = new Jett(nome_usuario, itemPadrao);
        Personagem LeeSin = new LeeSin(nome_usuario, itemPadrao);
        herois.add(Ashe);
        herois.add(Jett);
        herois.add(LeeSin);

        ArrayList<Personagem> inimigos = new ArrayList<Personagem>();
        Personagem Arauto = new Arauto();
        Personagem Plankton = new Plankton();
        inimigos.add(Arauto);
        inimigos.add(Plankton);

        ArrayList<Personagem> bosses = new ArrayList<Personagem>();
        Personagem Baron = new Baron(5);
        Personagem Midas = new Midas();
        bosses.add(Baron);
        bosses.add(Midas);

        System.out.println("Escolha seu herói: ");
        for (Personagem heroi: herois) {
            System.out.println(i++ + ": " + heroi.getNomePersonagem());
        };
        int personagemEscolhido = funcoes.validarOpcao(1, herois.size(), "Herói");
        while (true) {
            int opcao, inimigoEscolhido, bossEscolhido;
            funcoes.listarOpcoes();
            opcao = funcoes.validarOpcao( 1, 3, "Opção");
            if (opcao == 1) {
                System.out.println("Inimigos disponíveis: ");
                funcoes.listarPersonagens(inimigos);
                inimigoEscolhido = funcoes.validarOpcao(1, inimigos.size(), "Inimigo");
            } else if (opcao == 2) {
                System.out.println("Bosses disponíveis: ");
                funcoes.listarPersonagens(bosses);
                bossEscolhido = funcoes.validarOpcao(1, bosses.size(), "Boss");
            } else {
                System.out.println("Até mais!");
                break;
            }
        }
    }
}