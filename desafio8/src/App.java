/* Enunciado
Crie um programa para aplicar uma cadeia de descontos no total da compra.

Os descontos são:

Se comprar 15 itens ou mais, aplicar 10% de desconto.
Se comprar 10 itens e menos de 15 aplicar 8% de desconto.
Se comprar 5 itens e menos de 10 aplicar 5% de desconto.
Se comprar menos que 5 itens não aplicar desconto.
Ao aplicar o desconto encerre a cadeia de verificações.
Deixe o código aberto para que outros tipos de descontos sejam aplicados futuramente.
 */


public class App {
    public static void main(String[] args) throws Exception {
       Produto produto = new Produto();

       
       System.out.println(produto.comprar(11, 100));
    }


}
