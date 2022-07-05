public class Produto {
    
    public double comprar(int quantidadeItens, double totalDaCompra){
        if(quantidadeItens >= 15){
            Desconto10 desconto10 = new Desconto10();
            return desconto10.aplicarDesconto(totalDaCompra);
        }else if(quantidadeItens >= 10 && quantidadeItens < 15){
            Desconto8 desconto8 = new Desconto8();
            return desconto8.aplicarDesconto(totalDaCompra);
        }else if(quantidadeItens >= 5 && quantidadeItens < 10){
            Desconto5 desconto5 = new Desconto5();
            return desconto5.aplicarDesconto(totalDaCompra);
        } else{
            return totalDaCompra;
        }
    }

}
