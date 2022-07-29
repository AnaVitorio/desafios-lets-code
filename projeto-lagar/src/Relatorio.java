public class Relatorio {

    public synchronized void gerar(Caminhao caminhao) {    
        System.out.println("Relatorio Gerado - Tempo "+caminhao.getContador());
    }
    
}
