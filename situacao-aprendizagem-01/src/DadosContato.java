
public class DadosContato {
	
	private String email;
	private String telefone;
	
	//come�o email
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		
		if(email.isEmpty()) { 
			System.out.println("NOME OBRIGAT�RIO");
			System.exit(0);
			}else {
		this.email = email;}
		
		//fim email
		
		
		//come�o telefone
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		
		if(telefone.isEmpty()) { 
			System.out.println("CAMPO OBRIGAT�RIO");
			System.exit(0);
			}else { 
			int tamanho = telefone.length(); {
			if(tamanho < 15) {
				System.out.println("INFORME O N�MERO DE TELEFONE COMPLETO");
				System.exit(0);
				}else {
				this.telefone = telefone;
					
				}
			}		
		}
		
		
		//fim email
	}
	
	//fim do c�digo
}
