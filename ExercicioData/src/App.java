import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* Enunciado
Nos anos 80 os nascimentos estavam sendo apontados a mão sem utilizar um padrão.
Entretanto houve um processo de digitalização que ainda assim não foi adotado um padrão para as datas
e continua tudo desformatado! Apesar da lista de nascimentos ser extensa foi detectado que há apenas 4 variações.
Encontre uma resolução para processar estas datas de nascimento, onde:

Não deve utilizar Stream.
É obrigatório utilizar o Java Time.
É preciso descobrir a pessoa mais velha e a mais nova.
 */

public class App {
    public static void main(String[] args) throws Exception {
        List<Map<String, String>> original = new ArrayList<>();
        original.add(Map.of("nome", "João", "nascimento", "1985-12-11 12:10:33"));
        original.add(Map.of("nome", "Maria", "nascimento", "24-07-1988 23:02:41"));
        original.add(Map.of("nome", "Ana", "nascimento", "03:58:26 14-02-1983"));
        original.add(Map.of("nome", "Pedro", "nascimento", "08:03:07 1989-11-02"));


        String regexAnoMesDiaHora = "^\\d{4}-\\d{2}-\\d{2}\\s\\d{2}:\\d{2}:\\d{2}";
        String regexDiaMesAnoHora = "^\\d{2}-\\d{2}-\\d{4}\\s\\d{2}:\\d{2}:\\d{2}";
        // String regexHoraDiaMesAno = "^\\d{2}:\\d{2}:\\d{2}\\s\\d{2}-\\d{2}-\\d{4}";
        // String regexHoraAnoMesDia = "^\\d{2}:\\d{2}:\\d{2}\\s\\d{4}-\\d{2}-\\d{2}";

        for (Map<String,String> map : original) {
            if(map.get("nascimento").matches(regexAnoMesDiaHora)){
                System.out.println(formataAnoMesDiaHora(map.get("nascimento")));
            } else if(map.get("nascimento").matches(regexDiaMesAnoHora)){
                System.out.println(map.get("nascimento").replaceAll("-", "/"));
            } else {
                String[] arrayString = map.get("nascimento").split(" ");
                String novaString = arrayString[1] +" "+arrayString[0];
                if(novaString.matches(regexAnoMesDiaHora)){
                    System.out.println(formataAnoMesDiaHora(novaString));   
                }else{
                    System.out.println(novaString.replaceAll("-", "/"));
                }
               
            }
            
        }
      
    }

    //Agora eu preciso atualizar o map com os novos valores de nascimento

    public static String formataAnoMesDiaHora(String data){
        DateTimeFormatter formatadorDataEHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime dataNascimento = LocalDateTime.parse(data.replace(" ", "T"));
        String nascimentoFormatado = dataNascimento.format(formatadorDataEHora);
        return nascimentoFormatado;

    }
  
}
