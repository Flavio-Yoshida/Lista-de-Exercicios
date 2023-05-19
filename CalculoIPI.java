import java.util.Scanner;

public class CalculoIPI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a porcentagem do IPI a ser acrescido: ");
        double ipi = scanner.nextDouble();

        System.out.print("Digite o código da peça 1: ");
        int codigo1 = scanner.nextInt();

        System.out.print("Digite o valor unitário da peça 1: ");
        double valorUnitario1 = scanner.nextDouble();

        System.out.print("Digite a quantidade da peça 1: ");
        int quantidade1 = scanner.nextInt();

        System.out.print("Digite o código da peça 2: ");
        int codigo2 = scanner.nextInt();

        System.out.print("Digite o valor unitário da peça 2: ");
        double valorUnitario2 = scanner.nextDouble();

        System.out.print("Digite a quantidade da peça 2: ");
        int quantidade2 = scanner.nextInt();

        double total = (valorUnitario1 * quantidade1 + valorUnitario2 * quantidade2) * (ipi / 100 + 1);

        System.out.println("O valor total a ser pago é: " + total);
    }
}