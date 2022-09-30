import java.util.Scanner;

public class TesteJogadores {
    public static void main (String [] args){
       

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nome do Jogador: ");
        String nome1 = sc.nextLine();
        System.out.println("Seleção: ");
        String selecao1 = sc.nextLine();
        System.out.println("Número: ");
        int numero1 = sc.nextInt();


        sc.nextLine();

        System.out.println("\nNome do Jogador: ");
        String nome2 = sc.nextLine();
        System.out.println("Seleção: ");
        String selecao2 = sc.nextLine();
        System.out.println("Número: ");
        int numero2 = sc.nextInt();

        Jogadores jogador1 = new Jogadores(nome1,selecao1,numero1);
        sc.nextLine();
        Jogadores jogador2 = new Jogadores(nome2,selecao2,numero2);

        jogador1.exibirMensagem();
        sc.nextLine();
        jogador2.exibirMensagem();

        
    }
}
