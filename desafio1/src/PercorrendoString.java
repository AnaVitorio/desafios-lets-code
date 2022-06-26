import java.util.ArrayList;
import java.util.List;

public class PercorrendoString {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        String sequencia = "frdts3XXX6xxbl2XXXeee53XXX5";
        for (int i=0; i<sequencia.length(); i++) {
            char c = sequencia.charAt(i);
            //System.out.println(Character.isDigit(c)); 
            if(Character.toString(c).equals("X")){
                if(Character.toString(sequencia.charAt(i+1)).equals("X") && (Character.toString(sequencia.charAt(i+2)).equals("X")) ){
                    lista.add(sequencia.substring(i-1, i+4));
                }
            }
         }

         for(String caractere: lista){
            System.out.println(caractere);
         }

         for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
         }
    }
}
