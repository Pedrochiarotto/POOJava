package Jogo;

import java.util.ArrayList;
import java.util.Scanner;

public class FuncoesPlayer {
    public void listarItens(ArrayList<Item> itens) {
        int i = 1;
        for (Item item: itens) {
            System.out.println(i++ + ": " + item.getNome());
        }
    }

    public void listarPersonagens(ArrayList<Personagem> personagems) {
        int i = 1;
        for (Personagem personagem: personagems) {
            System.out.println(i++ + ": " + personagem.getNomePersonagem());
        }
    }

    public int validarOpcao(int primeiroNum, int ultimoNum, String tipo) {
        Scanner input = new Scanner(System.in);
        int valor;
        while (true) {
            valor = input.nextInt();
            if (valor < primeiroNum || valor > ultimoNum) {
                System.out.println(tipo + " inválido, tente novamente");
            } else {
                return valor;
            }
        }
    }

    public void listarOpcoes() {
        System.out.println("1: Batalhar com um inimigo");
        System.out.println("2: Batalhar com um boss");
        System.out.println("3: Sair do jogo");
    }
}
