
public class DadosPessoais {

private String Nome;
private String Sobrenome;
private String Data;
private String genero;


//come�o classe nome+
public String getNome() {
	return Nome;
}

	public void setNome(String nome) {
	if(nome.isEmpty()) { 
		System.out.println("NOME OBRIGAT�RIO");
		System.exit(0);
		}else { 
		int tamanho = nome.length(); {
		if(tamanho < 3) {
			System.out.println("MINIMO DE TR�S CARACTERES");
			System.exit(0);
			}else {	
				this.Nome = nome;
			}
		}		
	}
	
	//fim classe nome
}
//come�o classe SobreNome
	public String getSobrenome() {
		return Sobrenome;
}
	public void setSobrenome(String Sobrenome) {
	
	if(Sobrenome.isEmpty()) { 
		System.out.println("SOBRENOME OBRIGAT�RIO");
		System.exit(0);
		}else { 
		int tamanho = Sobrenome.length(); {
		if(tamanho < 3) {
			System.out.println("MINIMO DE TR�S CARACTERES");
			System.exit(0);
			}else {	
				this.Sobrenome = Sobrenome;
			}
		}		
	}
	
	
	//fim classe SobreNome
}
//come�om da calsse Data

	public String getData() {
		return Data;
}
	public void setData(String data) {
	
	if(data.isEmpty()) { 
		System.out.println("CAMPO OBRIGAT�RIO");
		System.exit(0);
		}else { 
		int tamanho = data.length(); {
		if(tamanho < 10) {
			System.out.println("INFORME A DATA COMPLETA");
			System.exit(0);
			}else {
			
			}
		}		
	}
	Data = data;
	//Fim da Classe Data
}
	//come�o da classe Genero
	public String getGenero() {
		return genero;
}

	public void setGenero(String genero) {
	
	if(genero.isEmpty()) { 
		System.out.println("N�O SLECIONOU UM GENERO");
		System.exit(0);
		}else { 
		if(genero.equalsIgnoreCase("Feminino")) {
			this.genero = genero;
			}else {	
				
		if(genero.equalsIgnoreCase("masculino")) {
			this.genero = genero;
		}else {
			if(genero.equalsIgnoreCase("outros")) {
			}else {
				System.out.println("POR FAVOR INFORME OS GENEROS: MASCULINO FEMININO OU OUTROS");
				System.exit(0);
			}
		}
				
			}		
		}
	
	}
//fim da classe Genero
}
//fim do c�digo
