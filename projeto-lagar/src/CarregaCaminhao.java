public class CarregaCaminhao implements Runnable{

    @Override
    public void run() {
        System.out.println("carregando");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
    
}
