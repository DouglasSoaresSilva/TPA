import java.util.Scanner;// Importa a classe Scanner, usada para ler entradas do usuário

public class PularNumeros {
    public static void main(String[] args) {

        // Cria um objeto Scanner para ler o que o usuário digitar
        Scanner scanner = new Scanner(System.in);

        // Variável que armazenará o valor do pulo informado pelo usuário
        int pulo;

        // Variável que começa em 1 (primeiro número a ser mostrado)
        int numero = 1;

        // Pede ao usuário que digite o intervalo de pulo
        System.out.print("Digite o intervalo entre cada número: ");
        pulo = scanner.nextInt(); // Lê o valor digitado e na variável pulo

        // Mostra uma mensagem informando o intervalo escolhido
        System.out.println("Números de 1 a 100 pulando de " + pulo + " em " + pulo + ":");

        //Estrutura da repetição do...while 
        //O bloco dentro do "do" vai ser executado pelo menos 1 vez
        do {
            // Exibe o número atual na tela
            System.out.print(numero + " ");

            // Soma o valor do pulo ao número atual
            numero += pulo;

            // O laço continuará enquanto 'numero' for menor ou igual a 100
        } while (numero <= 100);

        // Fecha o Scanner 
        scanner.close();
    }
}