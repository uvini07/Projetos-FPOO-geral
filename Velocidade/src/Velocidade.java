import java.util.Scanner;

public class Velocidade {
	
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("CALCULE O LITRO POR DISTANCIA");
		
		double T , V, D, L;
		
		System.out.println("INFORME TEMPO:");
		T = scanner.nextDouble();
		
		System.out.println("INFORME VELOCIDADE:");
		V = scanner.nextDouble();
		
		D = T * V;
		 
		L = D / 12; 
		
		System.out.println("Tempo Decorrido: " + T);
		System.out.println("Velocidade Utilizada: " + V);
		System.out.println("Distância = " + D);
		System.out.println("Litros usados = " + L);
		
		
	}
}
