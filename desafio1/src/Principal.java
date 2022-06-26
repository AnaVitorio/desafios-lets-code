import java.util.ArrayList;
import java.util.List;

/* Escreva um algoritmo que receba um parâmetro String.

Verificar se há 3 letras "X" em sequência entre dois números que somam 8.
Exemplo: frdts2XXX6xxbl2XXXeee5

Retorna true pois a String possui a combinação "2XXX6" (Sequencia de 3 "X" entre os números 6 e 2 que somam 8).
 */

 // Talvez o mais simples seria utilizar uma expressão regular
public class Principal{
    public static void main(String[] args) {
        String sequenciaCaractere = "frdts2XXX6xxbl2XXXeee5";
        List<String> listaComPadrao = listaComPadraoProcurado(sequenciaCaractere);
        int tamanhoDaLista = listaComPadrao.size();
        boolean retorno = false;

        for(int i = 0; i < tamanhoDaLista; i++){
            if(verificaString(listaComPadrao.get(i))){
                retorno = true;
                break;
            } else{
                retorno = false;
            }
        }

        System.out.println(retorno);

             
    }

    public static List<String> listaComPadraoProcurado(String sequencia){
        List<String> lista = new ArrayList<>();
        
        for (int i=0; i<sequencia.length(); i++) {
            char c = sequencia.charAt(i);
            if(Character.toString(c).equals("X")){
                if(Character.toString(sequencia.charAt(i+1)).equals("X") && (Character.toString(sequencia.charAt(i+2)).equals("X")) ){
                    lista.add(sequencia.substring(i-1, i+4));
                }
            }
         }

         return lista;
    }

    public static boolean verificaString(String sequenciaCaracteres){
        try{
            int numero1 = Integer.parseInt(Character.toString(sequenciaCaracteres.charAt(0)));
            int numero2 = Integer.parseInt(Character.toString(sequenciaCaracteres.charAt(sequenciaCaracteres.length()-1)));
            if((numero1+numero2) == 8){
                return true;
            } else{
                return false;
            } 
            
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
}