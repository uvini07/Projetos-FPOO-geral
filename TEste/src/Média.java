
import java.util.Scanner;

public class M�dia{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as quatro notas do aluno:");

        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4.0;
        System.out.println("A m�dia do aluno �: " + media);

        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Digite a nota da Recupera��o:");
            double nota5 = scanner.nextDouble();

            media = (nota1 + nota2 + nota3 + nota4 + nota5) / 5.0;
            System.out.println("A nova m�dia do aluno �: " + media);

            if (media >= 7.0) {
                System.out.println("Aprovado :)");
            } else {
                System.out.println("Reprovado :( ");
            }
        }
    }
}