import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) throws Exception {
        LocalDate dataHoje = LocalDate.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        String dataHojeFormatada = dataHoje.format(formatador);
        System.out.println(dataHojeFormatada);
        
        //Data de hoje menos 22 anos
        LocalDate valor = dataHoje.minus(22, ChronoUnit.YEARS);
        System.out.println(valor);
        
        //Data de hoje menos 30 dias
        LocalDate menos30Dias = dataHoje.minus(Period.ofDays(30));
        System.out.println(menos30Dias);

        //Mais 30 dias
        System.out.println(dataHoje.plusDays(30));

        //numero de dias no mes
        System.out.println(dataHoje.lengthOfMonth());

        //numeros de dias no ano
        System.out.println(dataHoje.lengthOfYear());

        //Retorna se o ano é bissexto ou não
        System.out.println("O ano é bissexto: "+dataHoje.isLeapYear());

        //Dia da semana
        System.out.println("Dia da Semana: "+dataHoje.getDayOfWeek().name());

        LocalDate dataEspecifica = LocalDate.parse("2000-02-22");

        //Período entre duas datas
        Period periodo = Period.between(dataEspecifica, dataHoje);
        System.out.println(periodo);

        LocalDate aniversario = LocalDate.parse("2000-02-22");
        LocalDate proximoaniversario = aniversario.plusYears(23); 
        System.out.println(proximoaniversario.format(formatador));


        String data = "03:58:26 14-02-1983";


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");
        LocalDateTime dateTime = LocalDateTime.parse(data, formatter);
        System.out.println(dateTime);
    
        DateTimeFormatter formatoSaida = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(dateTime.format(formatoSaida));
    



        for(String zone : ZoneId.getAvailableZoneIds()){
            System.out.println(zone);
        }
    }
}
