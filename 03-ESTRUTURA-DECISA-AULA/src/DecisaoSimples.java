
public class DecisaoSimples {
	
	public void testeMenor(int valor1, int valor2) {
		if (valor1 < valor2) {
			System.out.println("VALOR 1: " + valor1 + " � MENOR QUE " + valor2);
		
		}
	}
	
	public void testeMenorIgual(int valor1, int valor2) {
		if (valor1 <= valor2) {
			System.out.println("VALOR 1: " + valor1 + " � MENOR OU IGUAL QUE O VALOR2: " + valor2);
		}
	}
		
	public void testeMaior(int valor1, int valor2) {
		if (valor1 > valor2) {
			System.out.println("VALOR 1: " + valor1 + " � MAIOR QUE " + valor2);
			
		}
	}	
		
	public void testeMaiorIgual(int valor1, int valor2) {
		if (valor1 >= valor2) {
			System.out.println("VALOR 1: " + valor1 + " � MAIOR OU IGUAL QUE " + valor2);
			
		}
	}	
		
	public void testeIgual(int valor1, int valor2) {
		if (valor1 == valor2) {
			System.out.println("VALOR 1: " + valor1 + " � IGUAL AO VALOR2: " + valor2);
			
		}
	}	
		
	public void testeDiferente(int valor1, int valor2) {
		if (valor1 != valor2) {
			System.out.println("VALOR 1: " + valor1 + " � DIFERENTE DO VALOR2: " + valor2);
			
		}
			
	}
	
}
