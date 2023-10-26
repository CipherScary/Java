package tabelatrabalho;

import java.util.Scanner;

public class teste5 {
    public static void main(String[] args) {
        // Declaração dos nomes dos times
        String[] times = {
            "América Mineiro", "Athletico-PR", "Atlético Mineiro", "Bahia", "Botafogo",
            "Corinthians", "Coritiba", "Cruzeiro", "Cuiabá", "Flamengo",
            "Fluminense", "Fortaleza", "Goiás", "Grêmio", "Internacional",
            "Palmeiras", "Red Bull Bragantino", "Santos", "São Paulo", "Vasco"
        };

        // Arrays para armazenar as pontuações e número de vitórias
        int[] pontuacoes = new int[times.length];
        int[] Vitorias = new int[times.length];

        // Objeto Scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Apresenta o menu de opções
            System.out.println("\nEscolha uma opcao:");
            System.out.println("1 - Visualizar tabela");
            System.out.println("2 - Editar Pontuaçao");
            System.out.println("3 - Editar Vitorias");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 0:
                    scanner.close();
                    return;
                case 1:
                    // Exibe a tabela de classificação
                    exibirTabela(times, pontuacoes, Vitorias);
                    break;
                case 2:
                    // Permite a edição das pontuações
                    editarPontuacao(times, pontuacoes, scanner, Vitorias);
                    break;
                case 3:
                    // Permite a edição do número de vitórias
                    editarVitorias(times, pontuacoes, Vitorias, scanner);
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        }
    }

    public static void exibirTabela(String[] times, int[] pontuacoes, int[] Vitorias) {
        // Encontra os comprimentos máximos para alinhar a tabela
        int maxNomeTimeLength = 0;
        int maxPontuacaoLength = 0;
        int maxVitoriasLength = 0;

        for (int i = 0; i < times.length; i++) {
            maxNomeTimeLength = Math.max(maxNomeTimeLength, times[i].length());
            maxPontuacaoLength = Math.max(maxPontuacaoLength, String.valueOf(pontuacoes[i]).length());
            maxVitoriasLength = Math.max(maxVitoriasLength, String.valueOf(Vitorias[i]).length());
        }

        // Imprime cabeçalho da tabela
        System.out.println("\nPosicao | " + String.format("%-" + maxNomeTimeLength + "s", "Time") + " | " +
                String.format("%-" + maxPontuacaoLength + "s", "Pontuacao") + " | " +
                String.format("%-" + maxVitoriasLength + "s", "Vitorias"));

        // Imprime os dados de cada time
        for (int i = 0; i < times.length; i++) {
            System.out.println(String.format("%7d | %-" + maxNomeTimeLength + "s | %-" + maxPontuacaoLength + "s | %-" + maxVitoriasLength + "s",
                    (i + 1), times[i], pontuacoes[i], Vitorias[i]));
        }
    }

    public static void exibirTimes(String[] times, int[] pontuacoes, int[] Vitorias) {
        for (int i = 0; i < times.length; i++) {
            System.out.println(
                    (i + 1) + " - " + times[i] + " | Pontuacao: " + pontuacoes[i] + " | Vitorias:" + Vitorias[i]);
        }
    }
    
    public static void editarPontuacao(String[] times, int[] pontuacoes, Scanner scanner, int[] Vitorias) {
        while (true) {
            System.out.println("\nTimes disponíveis para edição");
            // Exibe os times disponíveis
            exibirTimes(times, pontuacoes, Vitorias);
            System.out.println("Escolha o número para editar a pontuação (ou 0 para voltar): ");

            int posicao = scanner.nextInt();

            if (posicao == 0) {
                break;
            }

            if (posicao >= 1 && posicao <= times.length) {
                System.out.println("Digite a nova pontuação para " + times[posicao - 1] + ":");
                int novaPontuacao = scanner.nextInt();

                if (novaPontuacao >= 0) {
                    // Atualiza a pontuação
                    pontuacoes[posicao - 1] = novaPontuacao;
                } else {
                    System.out.println("A pontuação não pode ser negativa.");
                }
            } else {
                System.out.println("Posição inválida. Tente novamente.");
            }

            scanner.nextLine();

            // Reorganiza a tabela com base nas pontuações e vitórias
            ordenarPontuacaoEVitorias(times, pontuacoes, Vitorias);
        }
    }

    public static void editarVitorias(String[] times, int[] pontuacao, int[] Vitorias, Scanner scanner) {
        while (true) {
            System.out.println("\nTimes disponíveis para edição:");
            exibirTimes(times, pontuacao, Vitorias);
            System.out.println("\nEscolha o número do time para editar as vitórias (ou 0 para voltar):");
            int posicao = scanner.nextInt();
            if (posicao == 0) {
                break;
            }
            if (posicao >= 1 && posicao <= times.length) {
                System.out.println("Digite o novo número de vitórias do " + times[posicao - 1] + ":");
                int novasVitorias = scanner.nextInt();
                if (novasVitorias >= 0) {
                    // Atualiza o número de vitórias
                    Vitorias[posicao - 1] = novasVitorias;
                } else {
                    System.out.println("O número de vitórias não pode ser negativo.");
                }
            } else {
                System.out.println("Posição inválida, tente novamente.");
            }
            scanner.nextLine();

            // Reorganiza a tabela com base nas pontuações e vitórias
            ordenarPontuacaoEVitorias(times, pontuacao, Vitorias);
        }
    }

    public static void ordenarPontuacaoEVitorias(String[] times, int[] pontuacoes, int[] Vitorias) {
        // Ordena os times com base nas pontuações e vitórias
        for (int i = 0; i < pontuacoes.length - 1; i++) {
            for (int j = i + 1; j < pontuacoes.length; j++) {
                if (pontuacoes[i] < pontuacoes[j] || (pontuacoes[i] == pontuacoes[j] && Vitorias[i] < Vitorias[j])) {

                    // Troca as posições dos times, pontuações e vitórias
                    int tempPontuacao = pontuacoes[i];
                    pontuacoes[i] = pontuacoes[j];
                    pontuacoes[j] = tempPontuacao;

                    String tempTime = times[i];
                    times[i] = times[j];
                    times[j] = tempTime;

                    int tempVitorias = Vitorias[i];
                    Vitorias[i] = Vitorias[j];
                    Vitorias[j] = tempVitorias;
                }
            }
        }
    }
}