/* Escreva um algoritmo que receba um parâmetro String.

Verificar se há 3 letras "X" em sequência entre dois números que somam 8.
Exemplo: frdts2XXX6xxbl2XXXeee5

Retorna true pois a String possui a combinação "2XXX6" (Sequencia de 3 "X" entre os números 6 e 2 que somam 8).
 */

 // Talvez o mais simples seria utilizar uma expressão regular
public class Principal{
    public static void main(String[] args) {
        String sequenciaCaractere = "frdts3XXX6xxbl2XXXeee53XXX5";

        if(!verificaString(sequenciaCaractere)){
            System.out.println(VerificaSeTemOutraOcorrenciasDeXXX(sequenciaCaractere));
        }else{
            System.out.println(verificaString(sequenciaCaractere));
        }
             
    }

    public static boolean VerificaSeTemOutraOcorrenciasDeXXX(String caracteres){
        String xxx = "XXX";
        int index = caracteres.indexOf(xxx);
        String novaSequencia = caracteres.substring(index+4);
        int tamanhoCaractere = novaSequencia.length();
        //System.out.println(novaSequencia);
        
        if((tamanhoCaractere >= 5) && (novaSequencia.contains(xxx))){
            return verificaString(novaSequencia);
        } else{
            return false;
        }
    }

    //talvez seja melhor retorna a sequencia de caractere para que eu consiga atualizar ela
    public static boolean verificaString(String sequenciaCaracteres){
        String x = "XXX";
        int indexPrimeiroX = sequenciaCaracteres.indexOf(x);
        String x1 = Character.toString(sequenciaCaracteres.charAt(indexPrimeiroX));
        String x2 = Character.toString(sequenciaCaracteres.charAt(indexPrimeiroX+1));
        String x3 = Character.toString(sequenciaCaracteres.charAt(indexPrimeiroX+2));
        String xxx = x1+x2+x3;
        
        if(xxx.equals(x)){
            try {
                int numero1 = Integer.parseInt(Character.toString(sequenciaCaracteres.charAt(indexPrimeiroX-1)));
                int numero2 = Integer.parseInt(Character.toString(sequenciaCaracteres.charAt(indexPrimeiroX+3)));
                if((numero1+numero2) == 8){
                    return true;
                } else {
                    return false;
                }
    
            } catch (NumberFormatException e) {
                return false;
            }

        } else{
            return false;
        }

        //Quando uma exceção é lançada e é necessário 
        //que determinada ação seja tomada mesmo após a sua captura, utilizamos a palavra reservada finally

    }
    
}