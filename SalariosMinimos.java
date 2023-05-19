import java.util.Scanner;

public class SalariosMinimos {
    public static void main(String[] args) {
        double salarioMinimo = 788.00;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário: ");
        double salarioUsuario = scanner.nextDouble();

        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;

        System.out.printf("O usuário ganha %.2f salários mínimos.", quantidadeSalariosMinimos);
    }
}
