<!DOCTYPE html>
<html lang="pt">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>README - Códigos em Java</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
        }
        h1, h2 {
            color: #333;
        }
        pre {
            background-color: #f4f4f4;
            padding: 10px;
            border-radius: 5px;
            border: 1px solid #ddd;
            overflow-x: auto;
        }
        code {
            background-color: #f4f4f4;
            font-family: Consolas, 'Courier New', monospace;
            color: #d6336c;
            padding: 2px 4px;
            border-radius: 4px;
        }
        .section {
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
    <h1>README - Explicação dos Códigos em Java</h1>

    <div class="section">
        <h2>1. Números Pares entre 1 e 20</h2>
        <p>Este programa exibe todos os números pares entre 1 e 20. Ele utiliza a estrutura de repetição <code>do...while</code> para garantir que o código seja executado pelo menos uma vez antes de verificar a condição.</p>
        <pre>
package com.mycompany.numerospares;
import java.util.Scanner;
//Código feito por Douglas Soares Silva - Professor Marcelo Collado
public class Numerospares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 2; //Começa com dois porque o primeiro número par é 2

        System.out.println("Os números pares entre 1 e 20 são:");
        do {
            System.out.print(numero + " ");
            numero += 2; // Incrementa 2 para o próximo número par
        } while (numero <= 20); // Continua enquanto número <= 20
        sc.close(); // Fecha o Scanner
    }
}
        </pre>
    </div>

    <div class="section">
        <h2>2. Tabuada do Número Informado</h2>
        <p>Este programa solicita ao usuário um número e exibe a tabuada de multiplicação desse número. A estrutura <code>do...while</code> é usada para garantir que a tabuada seja exibida de 1 a 10.</p>
        <pre>
package com.mycompany.tabuada;
import java.util.Scanner;
//Código feito por Douglas Soares Silva - Professor Marcelo Collado
public class Tabuada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para exibir a tabuada dele: ");
        int numero = sc.nextInt(); // Lê a entrada do usuário

        int i = 1; // Inicializa o contador
        System.out.println("Tabuada do " + numero + ":");
        do {
            System.out.println(numero + " x " + i + " = " + (numero * i)); // Exibe o cálculo
            i++; // Incrementa o contador
        } while (i <= 10); // Continua enquanto i <= 10
        sc.close(); // Fecha o Scanner
    }
}
        </pre>
    </div>

    <div class="section">
        <h2>3. Contagem de Números entre 100 e 125</h2>
        <p>Este programa exibe todos os números entre 100 e 125 e também conta quantos números foram exibidos. A estrutura <code>do...while</code> garante que o código continue enquanto o número for menor ou igual a 125.</p>
        <pre>
package com.mycompany.contagemdosnumeros;
import java.util.Scanner;
//Código feito Douglas Soares Silva - Professor Marcelo Collado
public class ContagemdosNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 100;
        int contador = 0; // Contador para contar os números exibidos

        System.out.println("Números entre 100 e 125:");
        do {
            System.out.print(numero + " "); // Exibe o número atual
            contador++; // Incrementa o contador
            numero++; // Passa para o próximo número
        } while (numero <= 125); // Continua enquanto o número for <= 125

        System.out.println("Quantidade total de números: " + contador); // Exibe o total de números
        sc.close(); // Fecha o Scanner
    }
}
        </pre>
    </div>
</body>
</html>

