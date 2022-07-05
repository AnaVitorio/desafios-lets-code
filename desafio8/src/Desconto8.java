public class Desconto8 implements DescontoInterface {

    @Override
    public double aplicarDesconto(double totalDaCompra) {
        return (totalDaCompra * 8) / 100;
        
    }
    
}
