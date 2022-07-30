import java.util.LinkedList;
import java.util.Queue;

public class Lagar extends Fazenda{
    public Lagar(Leitor leitor) {
        super(leitor);
    }

    Queue<Caminhao> fila = new LinkedList<>();


    public synchronized void adicionarCaminhaoNaFila(Caminhao caminhao) {
        if(fila.size() < 12){
            fila.add(caminhao);
        }else{
            //Parar a produção das plantações
            // this.setAtiva(false);
        }
        descarregaCaminhao(caminhao);
    }

    public void descarregaCaminhao(Caminhao caminhao){

        new Thread(caminhao.getNome()) {

            @Override
            public void run() {
                System.out.println("Descarregando caminhão "+caminhao.getNome());
                caminhao.setContador(caminhao.getContador()+1);
                try {
                    Thread.sleep(1000);   
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Relatorio relatorio = new Relatorio();
                relatorio.gerar(caminhao);
            }
            
        }.start();
        
        fila.poll();
        
        
        
                
        
    }

    
}
