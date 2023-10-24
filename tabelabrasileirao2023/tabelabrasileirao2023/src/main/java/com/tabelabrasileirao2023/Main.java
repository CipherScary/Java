package com.tabelabrasileirao2023;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       String[] times = {
        "América Mineiro", "Athletico-PR", "Atlético Mineiro", "Bahia", "Botafogo",
        "Corinthians", "Coritiba", "Cruzeiro", "Cuiabá", "Flamengo", 
        "Fluminense", "Fortaleza", "Goiás", "Grêmio", "Internacional",
        "Palmeiras", "Red Bull Bragantino", "Santos", "São Paulo", "Vasco"
        };
        int[] pontuacoes = new int [times.length];

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\nEscolha uma opcao:");
            System.out.println("1 - Visualizar tabela");
            System.out.println("2 - Editar Pontuaçao");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();

            switch(opcao){
                case 0:
                    scanner.close();
                    return;
                case 1:
                    exibirTabela(times, pontuacoes);
                    break;
                case 2:
                    editarPontuacao(times, pontuacoes, scanner);
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }

        }
        
    }
    
    public static void exibirTabela(String[] times, int[] pontuacoes){
        System.out.println("\nPosicao | Time | Pontuacao");
        for (int i = 0; i < times.length; i++){
            System.out.println((i + 1) + "       |" + times[i] + " | " + pontuacoes[i]);
        }
    }
    
    public static void exibirTimes(String[] times, int[] pontuacoes){
        for(int i = 0; i < times.length; i++){
            System.out.println((i + 1) + " - " + times[i] + " | Pontuacao: " + pontuacoes[i]);
        }
    }

    public static void editarPontuacao(String[] times, int[] pontuacoes, Scanner scanner){
        while (true){
            System.out.println("\nTimes disponiveis para edicao");
            exibirTimes(times, pontuacoes);
            System.out.println("Escolha  numero para editar a pontuacao (ou 0 para voltar): ");

            int posicao = scanner.nextInt();

            if (posicao == 0){
                break;
            }

            if (posicao >= 1 && posicao <= times.length){
            System.out.println("Digite a nova pontuacao para " + times[posicao - 1] + ":");
            int novaPontuacao = scanner.nextInt();
        
                if (novaPontuacao >= 0){
                    pontuacoes[posicao - 1] = novaPontuacao;
                } else {
                    System.out.println("A pontuacao nao pode ser negativa.");
                }
            } else {
                System.out.println("Posicao invalida. Tente novamente.");
            }   

            scanner.nextLine();
        }
        ordenarPontuacao(times, pontuacoes); 
    }

    public static void ordenarPontuacao(String[] times, int[] pontuacoes){
        for (int i = 0; i < pontuacoes.length - 1; i++){
            for (int j = i + 1; j < pontuacoes.length; j++){
                if(pontuacoes[i] < pontuacoes[j]){

                    int tempPontuacao = pontuacoes[i];
                    pontuacoes[i] = pontuacoes[j];
                    pontuacoes[j] = tempPontuacao;

                    String tempTime = times[i];
                    times[i] = times[j];
                    times[j] = tempTime;
                }
            }
        }
    }
}