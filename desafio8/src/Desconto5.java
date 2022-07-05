public class Desconto5 implements DescontoInterface {

    @Override
    public double aplicarDesconto(double totalDaCompra) {
        return (totalDaCompra * 5) / 100;
        
    }
    
}
