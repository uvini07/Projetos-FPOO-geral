import java.util.Scanner;

public class Main {

		public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		TipoTriangulo objTriangulo = new TipoTriangulo();
		
		
		int A, B, C;
		
        System.out.println("Digite o primeiro lado do tri�ngulo: ");
        A = scanner.nextInt();
        System.out.println("Digite o segundo lado do tri�ngulo: ");
        B = scanner.nextInt();
        System.out.println("Digite o terceiro lado do tri�ngulo: ");
        C = scanner.nextInt();
        
        objTriangulo.setResultado(scanner.nextInt());
		
		}
		
		

	}


