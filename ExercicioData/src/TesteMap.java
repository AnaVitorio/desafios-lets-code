import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TesteMap {
    public static void main(String[] args) {
        List<Map<String, String>> original = new ArrayList<>();
        original.add(Map.of("nome", "João", "nascimento", "1985-12-11 12:10:33"));
        original.add(Map.of("nome", "Maria", "nascimento", "24-07-1988 23:02:41"));
        original.add(Map.of("nome", "Ana", "nascimento", "03:58:26 14-02-1983"));
        original.add(Map.of("nome", "Pedro", "nascimento", "08:03:07 1989-11-02"));
 
        List<Map<String, String>> originalFormatado = new ArrayList<>();
        Map<String, String> mapa = new HashMap<>();
    


        for (Map<String,String> map : original) {
            originalFormatado.add(Map.of("nome", map.get("nome"), "nascimento", map.get("nascimento")));
           
        }
 
 
        List<String> listaNascimentos = new ArrayList<>();
        List<LocalDateTime> list = new ArrayList<>();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse("24-07-1988 23:02:41", formatter);
        System.out.println(dateTime);

        // for (Map<String,String> map : originalFormatado) {
        //     // System.out.println(map.get("nascimento"));
        //     listaNascimentos.add(map.get("nascimento"));
        //     String s = "24-07-1988 23:02:41";
        //     DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        //     LocalDateTime dateTime = LocalDateTime.parse(s, parser);
        //     list.add(dateTime);
        
        // }
        
        for(String nascimento : listaNascimentos){
            System.out.println(nascimento);
        }
        // long diferencaEmDias = ChronoUnit.DAYS.between(hoje, outraData);
    }

    }

