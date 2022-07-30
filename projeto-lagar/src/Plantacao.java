import java.util.Map;

public class Plantacao extends Fazenda {

    private String tipoPlantacao;
    private boolean isOcupada = false;
    private Leitor leitor;
    private Map<String, Integer> variedadeEDist;

    public void setVariedadeEDist(Map<String, Integer> variedadeEDist) {
        this.variedadeEDist = variedadeEDist;
    }

    public Plantacao(Leitor leitor) {
        super(leitor);
        this.leitor = leitor;
    }

    public String getTipoPlantacao() {
        return tipoPlantacao;
    }
    public void setTipoPlantacao(String tipoPlantacao) {
        this.tipoPlantacao = tipoPlantacao;
    }
    public boolean isOcupada() {
        return isOcupada;
    }

    public void setOcupada(boolean isOcupada) {
        this.isOcupada = isOcupada;
    }

   

    public Map<String, Integer> getVariedadeEDist() {
        return variedadeEDist;
    }

    // Assim que uma plantação for instanciada tem que ser atribuida a cada plantação um tipo;
    // Galega
    // Cordovil
    // Picual
    
    public void iniciar(Fazenda fazenda){
        //Talvez tudo isso tenha que ficar dentro de um while(true);
        // while(fazenda.isAtiva()){
        //     fazenda.getListaPlantacoes().stream()
        //           .filter(plantacao -> plantacao.isOcupada == false)
        //           .forEach(plantacaoDesocupada -> plantacaoDesocupada.carregarCaminhao(new Caminhao(plantacaoDesocupada.getNome(), plantacaoDesocupada.leitor.getCapacidadeTransCaminhao())));

        // }
        int carga = GerarRandomico.randomico(this.leitor.getCapacidadeTransCaminhao().get(0), 
                                            this.leitor.getCapacidadeTransCaminhao().get(1));

        fazenda.getListaPlantacoes().stream()
                  .filter(plantacao -> plantacao.isOcupada == false)
                  .forEach(plantacaoDesocupada -> plantacaoDesocupada.carregarCaminhao(new Caminhao(plantacaoDesocupada.getTipoPlantacao(), carga, carga/2, carga/2)));
    }

    public void carregarCaminhao(Caminhao caminhao){
        //Ainda precisa ser verificada se a plantação está ocupada;

        new Thread(caminhao.getNome()) {

            @Override
            public void run() {
                System.out.println("Carregando caminhão "+caminhao.getNome());
                caminhao.setContador(caminhao.getContador()+1);
                try {
                    Thread.sleep(1000);    
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
                transportarCaminhao(caminhao);
                
            }
            
        }.start();

        
        
    }

    public void transportarCaminhao(Caminhao caminhao) {
        
        new Thread(caminhao.getNome()) {

            @Override
            public void run() {
                System.out.println("Transportando caminhão "+caminhao.getNome());
                caminhao.setContador(caminhao.getContador()+1);
                //camminhao.getVariedadeEDist()
                //Fazer um sleep de acordo com a distância
                try {
                    Thread.sleep(1000);    
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Lagar lagar = new Lagar(leitor);
                lagar.adicionarCaminhaoNaFila(caminhao);
                
            }
            
        }.start();


       
       
        
        
    }

   
}
