import java.util.Locale;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double x, y, resultado;
        Scanner sc = new Scanner(System.in);

        int escolha;
        String opcao;

        do {
            limparTela();
            System.out.print("Digite o primeiro número: ");
            y = sc.nextDouble();
            System.out.print("Digite o segundo número: ");
            x = sc.nextDouble();

            System.out.print("Digite um número entre 1 e 4 para escolher a operação:\n" +
                    "1 - Soma\n" +
                    "2 - Multiplicação\n" +
                    "3 - Divisão\n" +
                    "4 - Subtração\n" +
                    "0 - Sair\n" +
                    "Escolha: ");
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    resultado = y + x;
                    opcao = "soma";
                    break;
                case 2:
                    resultado = y * x;
                    opcao = "multiplicação";
                    break;
                case 3:
                    resultado = y / x;
                    opcao = "divisão";
                    break;
                case 4:
                    resultado = y - x;
                    opcao = "subtração";
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    sc.close();
                    return; // Sai do programa
                default:
                    resultado = 0;
                    opcao = "inválido";
            }

            System.out.println("Resultado da " + opcao + " = " + String.format("%.2f", resultado));
            System.out.println(); // Espaço entre as operações
            pausarExecucao(2000); // Pausa por 2 segundos antes de continuar

        } while (true); // Repete indefinidamente, o loop será encerrado com "return" quando o usuário
                        // digitar 0
    }

    // Função para limpar o console
    public static void limparTela() {
        try {
            String os = System.getProperty("os.name").toLowerCase();

            ProcessBuilder processBuilder;
            if (os.contains("win")) {
                // Para Windows
                processBuilder = new ProcessBuilder("cmd", "/c", "cls");
            } else {
                // Para Unix/Linux/MacOS
                processBuilder = new ProcessBuilder("clear");
            }

            Process process = processBuilder.inheritIO().start();
            process.waitFor();
        } catch (Exception ex) {
            System.out.println("Erro ao limpar a tela: " + ex.getMessage());
        }
    }

    // Função para pausar a execução por um determinado número de milissegundos
    public static void pausarExecucao(int milissegundos) {
        try {
            Thread.sleep(milissegundos);
        } catch (InterruptedException ex) {
            System.out.println("Erro ao pausar a execução: " + ex.getMessage());
        }
    }
}
