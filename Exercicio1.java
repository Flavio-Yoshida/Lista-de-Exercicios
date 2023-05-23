import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade no formato (anos,meses,dias): ");
        String entrada = scanner.nextLine();

        // Dividir a entrada em anos, meses e dias
        String[] partes = entrada.split(",");
        int anos = Integer.parseInt(partes[0].trim());
        int meses = Integer.parseInt(partes[1].trim());
        int dias = Integer.parseInt(partes[2].trim());

        // Calcular o total de dias
        int totalDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("A idade expressa em dias é: " + totalDias + " dias.");
    }
}