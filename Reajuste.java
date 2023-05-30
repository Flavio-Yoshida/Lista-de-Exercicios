//Exercício 3
import java.util.Scanner;

public class Reajuste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor;
        do {
            System.out.println("Digite o valor:");
            while (!scanner.hasNextInt()) {//Enquanto
                System.out.println("Entrada inválida. Digite apenas números positivos:");
                scanner.next(); // Descarta a entrada inválida
            }
            valor = scanner.nextInt();
            if (valor <= 0) {
                System.out.println("Entrada inválida. Digite apenas números positivos:");
            }
        } while (valor <= 0);
        double reajuste = valor * 0.01; // Calcula o valor do reajuste (1% do valor)
        double valorReajustado = valor + reajuste; // Calcula o valor com o reajuste

        System.out.println("Valor com reajuste: " + valorReajustado);
    }
}