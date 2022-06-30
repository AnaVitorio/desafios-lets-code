public class App {
    public static void main(String[] args) throws Exception {
        int numero1 = 2;
        int numero2 = 6;

        intervaloEntreDoisNumeros(numero1, numero2);
        
    }

    public static void intervaloEntreDoisNumeros(int numero1, int numero2) {
        int soma = 0;
        int temporaria = numero1;
        if(numero1 < numero2){
            while(numero1 <= numero2){
                System.out.print(numero1++ +", ");
                soma = soma + (temporaria++);
            }
        } else if(numero1 > numero2){
            temporaria = numero2;
            int novoNumero1 = numero2;
            int novoNumero2 = numero1;
            while(novoNumero1 <= novoNumero2){
                System.out.print(novoNumero1++ +", ");
                soma = soma + (temporaria++);
            }
        } else{
            System.out.print(numero1+", ");
            soma = numero1;
        }

        System.out.println("Soma: "+soma);
       
    }
}
