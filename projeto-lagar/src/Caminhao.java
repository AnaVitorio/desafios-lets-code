public class Caminhao {
    private String nome;
    private int contador = 0;
    private int carga;
    private int tempoCarga; 
    private int tempoDescarga;

    public Caminhao(String nome, int carga, int tempoCarga, int tempoDescarga) {
        this.nome = nome;
        this.carga = carga;
        this.tempoCarga = tempoCarga;
        this.tempoDescarga = tempoDescarga;
    }
    

    public String getNome() {
        return nome;
    }

    public int getContador() {
        return contador;
    }


    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getCarga() {
        return carga;
    }


    public int getTempoCarga() {
        return tempoCarga;
    }


    public int getTempoDescarga() {
        return tempoDescarga;
    }

}
