public class Plantacao extends Fazenda {
    private String nome;
    private boolean isOcupada = false;
    // private Caminhao caminhao;

    public String getNome() {
        return nome;
    }
    public boolean isOcupada() {
        return isOcupada;
    }

    public void setOcupada(boolean isOcupada) {
        this.isOcupada = isOcupada;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    
    public void iniciar(Fazenda fazenda){
        fazenda.getListaPlantacoes().stream()
                  .filter(plantacao -> plantacao.isOcupada == false)
                  .forEach(plantacaoDesocupada -> plantacaoDesocupada.carregarCaminhao(new Caminhao(plantacaoDesocupada.getNome())));
    }

    public void carregarCaminhao(Caminhao caminhao){
        //Ainda precisa ser verificada se a plantação está ocupada;

        new Thread(caminhao.getNome()) {

            @Override
            public void run() {
                System.out.println("Carregando caminhão "+caminhao.getNome());
                caminhao.setContador(caminhao.getContador()+1);
                caminhao.setStatus(StatusCaminhao.CARREGADO);
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
                caminhao.setStatus(StatusCaminhao.TRANSPORTADO);
                try {
                    Thread.sleep(1000);    
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Lagar lagar = new Lagar();
                lagar.adicionarCaminhaoNaFila(caminhao);
                
            }
            
        }.start();


       
       
        
        
    }

   
}
