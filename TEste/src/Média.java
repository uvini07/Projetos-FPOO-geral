
import java.util.Scanner;

public class Média{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as quatro notas do aluno:");

        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4.0;
        System.out.println("A média do aluno é: " + media);

        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Digite a nota da Recuperação:");
            double nota5 = scanner.nextDouble();

            media = (nota1 + nota2 + nota3 + nota4 + nota5) / 5.0;
            System.out.println("A nova média do aluno é: " + media);

            if (media >= 7.0) {
                System.out.println("Aprovado :)");
            } else {
                System.out.println("Reprovado :( ");
            }
        }
    }
}