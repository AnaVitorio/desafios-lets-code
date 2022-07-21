import java.util.List;

public class Time {
    private String nomeDoTime;
    private List<Jogador> nomeJogadores;

    public Time(String nomeDoTime, List<Jogador> nomeJogadores) {
        this.nomeDoTime = nomeDoTime;
        this.nomeJogadores = nomeJogadores;
        
        for(Jogador jogador : nomeJogadores){
            jogador.setTime(nomeDoTime.toString());
        }
    }

    public String getNomeDoTime() {
        return nomeDoTime;
    }

    public List<Jogador> getNomeJogadores() {
        return nomeJogadores;
    }

    @Override
    public String toString() {
        return "Time [nomeDoTime=" + nomeDoTime + ", nomeJogadores=" + nomeJogadores + "]";
    }

}
