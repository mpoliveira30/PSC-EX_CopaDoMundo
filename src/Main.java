import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		Jogadores jogadores = new Jogadores();
	
		
		
		
		
		System.out.println("Quantos jogadores deseja inserir? ");
		int quantidadeJogadores = sc.nextInt();
		
		
		while(quantidadeJogadores>= jogadores.getContador() ) {
			jogadores.ContadorJogador();
			
			Scanner scan= new Scanner(System.in);
		
			System.out.printf("\nNome do Jogador: ");
        	String nome = scan.nextLine();
        	System.out.printf("Seleçao: ");
        	String selecao = scan.nextLine();
        	System.out.printf("Número: ");
        	int numero = scan.nextInt();
        	
 	        
 	        jogadores.setNome(nome);
			jogadores.getNome();
			jogadores.setSelecao(selecao);
			jogadores.getSelecao();
			jogadores.setNumero(numero);
			jogadores.getNumero();
			
 	        jogadores.ExibirMensagem(); 
 	         
		}
 	         
			

		
					
		}
		
		
		

		
		
		
	
		
		
		
		
		
	
	}

