import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Principal {
    public static void main(String[] args) throws Exception {
        List<Integer> lista1 = Arrays.asList(1,2,3,4);
        List<Integer> lista2 = Arrays.asList(2,5);

        List<Integer> listaUnida = unindoListas(lista1, lista2);

        List<Integer> listaSemElementosRepitidos = removendoElementosRepetidos(listaUnida);

        Collections.sort(listaSemElementosRepitidos, Collections.reverseOrder());

        for(Integer numero: listaSemElementosRepitidos){
            System.out.print(numero+",");
        }

       
    }


    public static List<Integer> unindoListas(List<Integer> lista1, List<Integer> lista2){
        List<Integer> listaUnida = new ArrayList<>();
       
        for(Integer numero : lista1){
            listaUnida.add(numero);
        }

        for(Integer numero : lista2){
            listaUnida.add(numero);
        }

        return listaUnida;
    }

    public static List<Integer> removendoElementosRepetidos(List<Integer> listaUnida){
        List<Integer> listaComElementosUnicos = new ArrayList<>();
        Set<Integer> colecaoSet = new HashSet<>();

        for(Integer numero : listaUnida){
            colecaoSet.add(numero);
        }

        for(Integer numero : colecaoSet){
            listaComElementosUnicos.add(numero);
        }

        return listaComElementosUnicos;

    }
}
