//Exercício 5
import java.util.Scanner;

public class SalariosMinimos {
    public static void main(String[] args) {
        double salarioMinimo = 788.00;
        Scanner scanner = new Scanner(System.in);

        double salarioUsuario;
        do {
            System.out.println("Digite seu salário:");
            while (!scanner.hasNextDouble()) {
                System.out.println("Entrada inválida. Digite apenas números positivos:");
                scanner.next(); // Descarta a entrada inválida
            }
            salarioUsuario = scanner.nextDouble();
            if (salarioUsuario <= 0) {
                System.out.println("Entrada inválida. Digite apenas números positivos:");
            }
        } while (salarioUsuario <= 0);

        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;

        System.out.printf("O usuário ganha %.2f salários mínimos.", quantidadeSalariosMinimos);
    }
}
