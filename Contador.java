import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        // Cria um objeto Scanner para leitura de entrada
        Scanner scanner = new Scanner(System.in);

        // Inicializa o valor do contador
        int contador = 0;
        String comando;

        System.out.println("Bem-vindo ao Contador!");
        System.out.println("Digite 'incrementar' para aumentar o contador.");
        System.out.println("Digite 'decrementar' para diminuir o contador.");
        System.out.println("Digite 'mostrar' para ver o valor atual do contador.");
        System.out.println("Digite 'sair' para terminar o programa.");

        // Loop principal do programa
        while (true) {
            System.out.print("Digite um comando: ");
            comando = scanner.nextLine();

            // Processa o comando
            switch (comando.toLowerCase()) {
                case "incrementar":
                    contador++;
                    System.out.println("Contador incrementado. Valor atual: " + contador);
                    break;

                case "decrementar":
                    contador--;
                    System.out.println("Contador decrementado. Valor atual: " + contador);
                    break;

                case "mostrar":
                    System.out.println("Valor atual do contador: " + contador);
                    break;

                case "sair":
                    System.out.println("Saindo do programa. Obrigado!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Comando inválido. Tente novamente.");
                    break;
            }
        }
    }
}


