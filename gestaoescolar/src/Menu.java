import java.util.Scanner;
public class Menu {

	Professor objProfessor;
	Aluno objAluno;
	Disciplina objDisciplina;
	Media objMedia;
	
	
		public void exibirMenu() {
		
		int opcao = 0;
		Scanner objScanner = new Scanner(System.in);
		
		while(opcao != 6) {
		
		System.out.println("ESCOLHA UMA OPÇÃO PELO NÚMERO: ");
		System.out.println("1- CADASTRAR PROFESSOR: ");
		System.out.println("2- CADASTRAR ALUNO: ");
		System.out.println("3- CADASTRAR DISCIPLINA: ");
		System.out.println("4- CADASTRAR NOTA: ");
		System.out.println("5- EXIBIR DADOS: ");
		System.out.println("6- SAIR: ");
		
		opcao = objScanner.nextInt();

		switch (opcao) {
		
		case 1:
			System.out.println("DIGITE O NOME DO PROFESSOR: ");
			objProfessor = new Professor();
			objProfessor.setNomeProfessor(objScanner.next());
			break;
			
		case 2:
			System.out.println("DIGITE O NOME DO AUNO: ");
			objAluno = new Aluno();
			objAluno.setNomeAluno(objScanner.next());
			break;
			
		case 3:
			System.out.println("DIGITE O NOME DO DISCIPLINA: ");
			objDisciplina = new Disciplina();
			objDisciplina.setNomeDisciplina(objScanner.next());
			break;
			
		case 4:
			System.out.println("DIGITE AS NOTAS: ");
			break;
			
		case 5:
			System.out.println("EXIBIR DADOS: ");
			System.out.println("PROFESSOR: " + objProfessor.getNomeProfessor());
			System.out.println("ALUNOS: " + objAluno.getNomeAluno());
			System.out.println("DISCIPLINA: " + objDisciplina.getNomeDisciplina());
			
			break;
			
		case 6:
			System.out.println("!--<3--!!OBRIGADO POR USAR!!--<3--! ");
			break;
		default:
			System.out.println("OPÇÃO INVALIDA");

			break;
			
		}
		}
	
	}//fim do metodo exibir
	
}//fim da classe menu
