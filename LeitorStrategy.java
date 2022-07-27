import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public abstract class LeitorStrategy {
    
    public String getData(String pathArquivo){
        String regexData = "\\s+?\\d{2}\\/\\d{2}\\/\\d{4}";
        List<String> listaLinhas = new ArrayList<>(); 
        String data = null;
        try (Stream<String> stream = Files.lines(Paths.get(pathArquivo))) {
            stream.filter(linhaAtual -> linhaAtual.matches(regexData)).forEach(linha -> listaLinhas.add(linha.trim()));
         } catch (IOException e) {
             e.printStackTrace();
         }
        return listaLinhas.get(0).trim();
    }

    public int getQuantidadeVariedade(String pathArquivo){
        String regexQuantVariedade = "\\d.Variedades de Azeitonas:";
        List<String> listaLinhas = new ArrayList<>(); 
        int quantiVariedades = 0;
        try (Stream<String> stream = Files.lines(Paths.get(pathArquivo))) {
            stream.filter(linhaAtual -> linhaAtual.matches(regexQuantVariedade))
                  .forEach(linha -> listaLinhas.add(linha));
         } catch (IOException e) {
             e.printStackTrace();
         }

        quantiVariedades = Integer.parseInt(Character.toString(listaLinhas.get(0).charAt(0)));
        return quantiVariedades;
    }

    public int getQuantidadePlantacoes(String pathArquivo){
        String regexQuantPlantacoes = "\\d.Plantações de Azeitonas:";
        List<String> listaLinhas = new ArrayList<>(); 
        int quantiPlantacos = 0;
        try (Stream<String> stream = Files.lines(Paths.get(pathArquivo))) {
            stream.filter(linhaAtual -> linhaAtual.matches(regexQuantPlantacoes))
                  .forEach(linha -> listaLinhas.add(linha));
         } catch (IOException e) {
             e.printStackTrace();
         }

        quantiPlantacos = Integer.parseInt(Character.toString(listaLinhas.get(0).charAt(0)));
        return quantiPlantacos;
    }

    public Map<String, Integer> getVariedadeEQtd(String pathArquivo){
        String padraoProcuradoVariedadeEQtd = "plantações de ";
        String padraoProcuradoVariedadeEQtd2 = "plantação de ";
        List<String> listaLinhas = new ArrayList<>(); 
        Map<String, Integer> variedadeEQtd = new HashMap<>();

        try (Stream<String> stream = Files.lines(Paths.get(pathArquivo))) {
            stream.map(linha -> linha.trim())
                .filter(linhaAtual -> linhaAtual.contains(padraoProcuradoVariedadeEQtd) || linhaAtual.contains(padraoProcuradoVariedadeEQtd2))
                .forEach(linhaMatche -> listaLinhas.add(linhaMatche));
         } catch (IOException e) {
             e.printStackTrace();
         }

        listaLinhas.stream().forEach(linha -> {
            int quant = Integer.parseInt(Character.toString(linha.charAt(0)));
            String variedade;
            String substring = linha.substring(linha.indexOf("de ") + 2).trim();
            variedade = substring.substring(0, substring.indexOf(" "));
            variedadeEQtd.put(variedade, quant);
        });

   

     return variedadeEQtd;

    }

    public Map<String, Integer> getVariedadeEDist(String pathArquivo){
        String padraoProcuradoVariedadeEDist = "plantações de ";
        String padraoProcuradoVariedadeEDist2 = "plantação de ";
        List<String> listaLinhas = new ArrayList<>(); 
        Map<String, Integer> variedadeEDist = new HashMap<>();

        try (Stream<String> stream = Files.lines(Paths.get(pathArquivo))) {
            stream.map(linha -> linha.trim())
                .filter(linhaAtual -> linhaAtual.contains(padraoProcuradoVariedadeEDist2) || linhaAtual.contains(padraoProcuradoVariedadeEDist))
                .forEach(linhaMatche -> listaLinhas.add(linhaMatche));
         } catch (IOException e) {
             e.printStackTrace();
         }

        listaLinhas.stream().forEach(linha -> {
            int distanciaSegundos;
            String variedade;
            String subString = linha.substring(linha.indexOf("segundos") - 2).trim();
            String substring = linha.substring(linha.indexOf("de ") + 2).trim();

            distanciaSegundos = Integer.parseInt(Character.toString(subString.charAt(0)));
            variedade = substring.substring(0, substring.indexOf(" "));
            variedadeEDist.put(variedade, distanciaSegundos);
        });

   

     return variedadeEDist;

    }

    public int getQtdRecepcao(String pathArquivo){
        List<String> listaLinhas = buscarPadrao(pathArquivo, "Capacidade");
        int qtdRecepecao = Integer.parseInt(Character.toString(listaLinhas.get(0).charAt(0)));
        return qtdRecepecao;
    
    }

    public List<Integer> getCapacidadeTransCaminhao(String pathArquivo){
        List<String> listaLinhas = buscarPadrao(pathArquivo, "Varia entre");
        List<Integer> capacidadeTransCaminhao = new ArrayList<>();
        String subString = listaLinhas.get(0).substring(listaLinhas.get(0).indexOf("até") - 3, listaLinhas.get(0).indexOf("até") + 7).trim();
        String max = subString.substring(subString.indexOf("até")+3).trim();
        String min = subString.substring(0, subString.indexOf("até")).trim();
        capacidadeTransCaminhao.add(Integer.parseInt(min));
        capacidadeTransCaminhao.add(Integer.parseInt(max));
      
        return capacidadeTransCaminhao;
    }

    public int getLimiteSupEsperaNoLagar(String pathArquivo){
        List<String> listaLinhas = buscarPadrao(pathArquivo, "Quando atingir");
        String subString = listaLinhas.get(0).substring(14).trim();
        String[] arraySubString = subString.split(" ");
        int limiteSupEsperaNoLagar = Integer.parseInt(arraySubString[0].toString());
        return limiteSupEsperaNoLagar;
    }


    public int getLimiteInfParaVoltarAOperar(String pathArquivo){
        List<String> listaLinhas = buscarPadrao(pathArquivo, "voltar atingir");
        String subString = listaLinhas.get(0).substring(31).trim();
        String[] arraySubString = subString.split(" ");
        int limiteInfEsperaNoLagar = Integer.parseInt(arraySubString[0].toString());
        return limiteInfEsperaNoLagar;
    }

    public List<String> buscarPadrao(String pathArquivo, String padrao){
        List<String> listaLinhas = new ArrayList<>(); 
        try (Stream<String> stream = Files.lines(Paths.get(pathArquivo))) {
            stream.filter(linhaAtual -> linhaAtual.contains(padrao))
                  .forEach(linha -> listaLinhas.add(linha.trim()));
         } catch (IOException e) {
             e.printStackTrace();
         }

         return listaLinhas;

    }


}
