public class Caminhao {
    private String nome;
    private int contador = 0;
    private int carga;
    private String tipoCarga;
    private int tempoCarga; 
    private int tempoDescarga;
    private int distanciaDoLagar;
    private String data;


    public Caminhao(int carga, int tempoCarga, int tempoDescarga, int distanciaDoLagar, String tipoCarga) {
        this.carga = carga;
        this.tempoCarga = tempoCarga;
        this.tempoDescarga = tempoDescarga;
        this.distanciaDoLagar = distanciaDoLagar;
        this.tipoCarga = tipoCarga;
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

    public int getDistanciaDoLagar() {
        return distanciaDoLagar;
    }

    public String getData() {
        return data;
    }


    public void setData(String data) {
        this.data = data;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }



}
