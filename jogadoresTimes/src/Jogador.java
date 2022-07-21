public class Jogador{
    private String nomeDoJogador;
    private Tipo posicao;
    private String time;

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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }



    @Override
    public String toString() {
        return "[ "+nomeDoJogador + ", posicao=" + posicao + "]";
    }

    
}
