import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExercicioData {
    public static void main(String[] args) throws Exception {
        List<Map<String, String>> original = new ArrayList<>();
        original.add(Map.of("nome", "João", "nascimento", "1985-12-11 12:10:33"));
        original.add(Map.of("nome", "Maria", "nascimento", "24-07-1988 23:02:41"));
        original.add(Map.of("nome", "Ana", "nascimento", "03:58:26 14-02-1983"));
        original.add(Map.of("nome", "Pedro", "nascimento", "08:03:07 1989-11-02"));

        List<Map<String, String>> originalConvertido = new ArrayList<>();

        String regexAnoMesDiaHora = "^\\d{4}-\\d{2}-\\d{2}\\s\\d{2}:\\d{2}:\\d{2}";
        String regexDiaMesAnoHora = "^\\d{2}-\\d{2}-\\d{4}\\s\\d{2}:\\d{2}:\\d{2}";
        String regexHoraDiaMesAno = "^\\d{2}:\\d{2}:\\d{2}\\s\\d{2}-\\d{2}-\\d{4}";

        LocalDateTime dataConvertida;

        
        for (Map<String,String> map : original) {
            if(map.get("nascimento").matches(regexAnoMesDiaHora)){
                dataConvertida = converteToLocalDateTime(map.get("nascimento"), "yyyy-MM-dd HH:mm:ss");
                originalConvertido.add(Map.of("nome", map.get("nome"), "nascimento",dataConvertida.toString()));
                
            } else if(map.get("nascimento").matches(regexDiaMesAnoHora)){
                dataConvertida = converteToLocalDateTime(map.get("nascimento"), "dd-MM-yyyy HH:mm:ss");
                originalConvertido.add(Map.of("nome", map.get("nome"), "nascimento",dataConvertida.toString()));

            } else if (map.get("nascimento").matches(regexHoraDiaMesAno)){
                dataConvertida = converteToLocalDateTime(map.get("nascimento"), "HH:mm:ss dd-MM-yyyy");
                originalConvertido.add(Map.of("nome", map.get("nome"), "nascimento",dataConvertida.toString()));
            } else{
                dataConvertida = converteToLocalDateTime(map.get("nascimento"), "HH:mm:ss yyyy-MM-dd");
                originalConvertido.add(Map.of("nome", map.get("nome"), "nascimento",dataConvertida.toString()));
            }
            
        }
      

        List<LocalDateTime> maisVelhoEMaisNovo = maisVelho(originalConvertido);
        String pessoaMaisVelha = "";
        String pessoaMaisNova = "";
        for (Map<String,String> map : originalConvertido) {
            if(map.get("nascimento").equals(maisVelhoEMaisNovo.get(0).toString())){
                pessoaMaisVelha = map.get("nome");
            }

            if(map.get("nascimento").equals(maisVelhoEMaisNovo.get(1).toString())){
                pessoaMaisNova = map.get("nome");
            }
            
        }

        System.out.printf("Pessoa mais velha: %s\n",pessoaMaisVelha);
        System.out.println("Nascimento: "+formatoFinalData(maisVelhoEMaisNovo.get(0)));
        System.out.printf("Pessoa mais nova: %s\n",pessoaMaisNova);
        System.out.println("Nascimento: "+formatoFinalData(maisVelhoEMaisNovo.get(1)));
    }


    public static String formatoFinalData(LocalDateTime data){
        DateTimeFormatter formatoSaida = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return data.format(formatoSaida);
    }

    public static LocalDateTime converteToLocalDateTime(String data, String formatoDeEntrada){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatoDeEntrada);
        LocalDateTime dateTime = LocalDateTime.parse(data, formatter);
        return dateTime;
    }


    public static List<LocalDateTime> maisVelho(List<Map<String, String>> originalConvertido){
        List<LocalDateTime> listaNascimentos = new ArrayList<>();
        List<LocalDateTime> maisVelhoEMaisNovo = new ArrayList<>();
        LocalDateTime data;

        for (Map<String,String> map : originalConvertido) {
            data = converteToLocalDateTime(map.get("nascimento").replace("T", " "), "yyyy-MM-dd HH:mm:ss");
            listaNascimentos.add(data);
        }

        LocalDateTime dataMaisVelha = listaNascimentos.get(0);
        LocalDateTime dataMaisNova = listaNascimentos.get(0);

        for (LocalDateTime localDateTime : listaNascimentos) {
            if(dataMaisVelha.isAfter(localDateTime)){
                dataMaisVelha = localDateTime;
            }
            if(dataMaisNova.isBefore(localDateTime)){
                dataMaisNova = localDateTime;
            }
        }
        maisVelhoEMaisNovo.add(dataMaisVelha);
        maisVelhoEMaisNovo.add(dataMaisNova);
        return maisVelhoEMaisNovo;
    }
    
}


    

    
  
