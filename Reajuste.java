import java.util.Scanner;

public class Reajuste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        double valor = ler.nextDouble();

        double reajuste = valor * 0.01;
        double valorReajustado = valor + reajuste;

        System.out.println("Valor com reajuste: " + valorReajustado);
    }
}