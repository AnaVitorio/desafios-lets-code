public class Jogador{
    private String nomeDoJogador;
    private Tipo posicao;

    public Jogador(String nomeDoJogador, Tipo posicao) {
        this.nomeDoJogador = nomeDoJogador;
        this.posicao = posicao;
    }
     
    public String getNomeDoJogador() {
        return nomeDoJogador;
    }

    public Tipo getPosicao() {
        return posicao;
    }
    
}
