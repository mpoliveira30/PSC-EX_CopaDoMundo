import java.sql.Time;

public class Jogadores {
    
    private String selecao;
    private String posicao;
    private int numero;
    private String nome;

    public Jogadores (String nome, String selecao, int numero){

        this.nome = nome;
        this.posicao = posicao;
        this.numero = numero;
        this.selecao = selecao;

    } 
    
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
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



    public void exibirMensagem(){
        System.out.printf("Jogador: %s Camisa: %d Seleção: %s", getNome(), getNumero(), getSelecao());
    }


    
}
