//Exercício 1
import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a data de nascimento (dd/mm/aaaa): ");
        String dataNascimento = scanner.next();

        String[] partesData = dataNascimento.split("/");

        int dia = Integer.parseInt(partesData[0]);
        int mes = Integer.parseInt(partesData[1]);
        int ano = Integer.parseInt(partesData[2]);

        int diasTotais = (2023 - ano) * 365 + mes * 30 + dia;

        System.out.println("A idade em dias é: " + diasTotais);
    }
}
