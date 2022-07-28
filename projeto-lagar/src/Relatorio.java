public class Relatorio {

    public synchronized void gerar(Caminhao caminhao) {
        try {
            while(!caminhao.getStatus().equals(StatusCaminhao.DESCARREGADO)){
                wait();
            }
            System.out.println("Relatorio Gerado - "+caminhao.getContador());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
