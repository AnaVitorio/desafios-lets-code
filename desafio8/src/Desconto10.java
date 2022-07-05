public class Desconto10 implements DescontoInterface {

    @Override
    public double aplicarDesconto(double totalDaCompra) {
        return (totalDaCompra * 10) / 100;
        
    }
    
}
