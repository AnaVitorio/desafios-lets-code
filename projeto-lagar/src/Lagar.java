import java.util.LinkedList;
import java.util.Queue;

public class Lagar extends Thread {
    Queue<Caminhao> fila = new LinkedList<>();


    public synchronized void adicionarCaminhaoNaFila(Caminhao caminhao) {
        fila.add(caminhao);
        descarregaCaminhao(caminhao);
    }

    public void descarregaCaminhao(Caminhao caminhao){

        new Thread(caminhao.getNome()) {

            @Override
            public void run() {
                System.out.println("Descarregando caminhão "+caminhao.getNome());
                caminhao.setContador(caminhao.getContador()+1);
                caminhao.setStatus(StatusCaminhao.DESCARREGADO);
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
