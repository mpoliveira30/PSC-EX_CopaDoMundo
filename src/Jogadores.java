public class Jogadores {
	
	private String selecao;
	private String posicao;
	private int numero;
	private String nome;
	private int quantidadeJogadores;
	private int contador=1;
	
	
	public Jogadores(String nome, String selecao, int numero) {
		this.nome = nome;
		this.selecao = selecao;
		this.numero = numero;
	} 

	public void ExibirMensagem() {
		System.out.printf("Jogador: %s Camisa: %d Selecao: %s", getNome(), getNumero(), getSelecao());
	}
	
	public void ContadorJogador() {
		contador = contador+1;	
	}
	
	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public Jogadores() {
	
	}


	public String getSelecao() {
		return selecao;
	}


	public void setSelecao(String selecao) {
		this.selecao = selecao;
	}


	public String getPosicao() {
		return posicao;
	}


	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getQuantidadeJogadores() {
		return quantidadeJogadores;
	}


	public void setQuantidadeJogadores(int quantidadeJogadores) {
		this.quantidadeJogadores = quantidadeJogadores;
	}


	
	
}
