import java.util.LinkedList;
import java.util.Queue;

public class Lagar extends Thread {
    Queue<Caminhao> fila = new LinkedList<>();

    //Acho que esse método vai te que ser synchronized
    //Para somente uma thread acessar esse método por vez;
    public void adicionarCaminhaoNaFila(Caminhao caminhao) {
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
                    Thread.sleep(3000);   
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
            }
            
        }.start();

        // try {
        //     //métodos join(). Este faz com que o programa aguarde a finalização
        //     // de cada thread para que depois possa ler o valor totalizado por cada tarefa.
        //     Thread.currentThread().join();
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        if(caminhao.getStatus().equals(StatusCaminhao.DESCARREGADO)){
            notifyAll();
        }
        fila.poll();
        Relatorio relatorio = new Relatorio();
        relatorio.gerar(caminhao);
        
    }

    
}
