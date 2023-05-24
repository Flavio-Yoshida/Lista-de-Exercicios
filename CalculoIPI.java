//Exercício 4

import java.util.Scanner;

public class CalculoIPI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a porcentagem do IPI a ser acrescido: ");
        double ipi;
        if (scanner.hasNextDouble()) {
            ipi = scanner.nextDouble();
        } else {
            System.out.println("Entrada inválida. Por favor, digite um número válido.");
            return; // Encerrar o programa
        }

        System.out.print("Digite o código da peça 1: ");
        int codigo1;
        if (scanner.hasNextInt()) {
            codigo1 = scanner.nextInt();
        } else {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro válido.");
            return; // Encerrar o programa
        }

        System.out.print("Digite o valor unitário da peça 1: ");
        double valorUnitario1;
        if (scanner.hasNextDouble()) {
            valorUnitario1 = scanner.nextDouble();
        } else {
            System.out.println("Entrada inválida. Por favor, digite um número válido.");
            return; // Encerrar o programa
        }

        System.out.print("Digite a quantidade da peça 1: ");
        int quantidade1;
        if (scanner.hasNextInt()) {
            quantidade1 = scanner.nextInt();
        } else {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro válido.");
            return; // Encerrar o programa
        }

        System.out.print("Digite o código da peça 2: ");
        int codigo2;
        if (scanner.hasNextInt()) {
            codigo2 = scanner.nextInt();
        } else {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro válido.");
            return; // Encerrar o programa
        }

        System.out.print("Digite o valor unitário da peça 2: ");
        double valorUnitario2;
        if (scanner.hasNextDouble()) {
            valorUnitario2 = scanner.nextDouble();
        } else {
            System.out.println("Entrada inválida. Por favor, digite um número válido.");
            return; // Encerrar o programa
        }

        System.out.print("Digite a quantidade da peça 2: ");
        int quantidade2;
        if (scanner.hasNextInt()) {
            quantidade2 = scanner.nextInt();
        } else {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro válido.");
            return; // Encerrar o programa
        }

        double total = (valorUnitario1 * quantidade1 + valorUnitario2 * quantidade2) * (ipi / 100 + 1);

        System.out.println("O valor total a ser pago é: " + total);
    }
}
