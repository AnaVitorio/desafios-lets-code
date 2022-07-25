import java.time.LocalDate;
import java.time.Month;


/* Enunciado
Um funcionário recebe uma comissão de 0.5% sobre o valor do seu dia trabalhado.

Criar uma função para receber o valor do salário mensal e o ano e partir dessas 
informações calcular a previsão do salário mês a mês.

Considerar apenas os dias úteis (segunda a sexta). */


public class ComissaoMesAMes {
    public static void main(String[] args) {
        // previsaoSalarioPorMes(1000, 2022);
        LocalDate data = LocalDate.of(2022, Month.FEBRUARY, 1);
        System.out.println(data.lengthOfMonth());

    }

    public static void previsaoSalarioPorMes(double salarioMensal, int ano ){
        double comissao = 0.05;
        LocalDate data = LocalDate.of(ano, Month.JANUARY, 1);
        LocalDate dataAnterior = data;
	   
        int diaDeSemana = 0;
        for(int i = 0; i < 12; i++){
            for(int j = 0; j < data.lengthOfMonth(); j++){
                if((!data.getDayOfWeek().name().equals("SATURDAY")) && (!data.getDayOfWeek().name().equals("SUNDAY"))){
                    diaDeSemana++;
                }
                data = data.plusDays(1);
            }

            double salarioComComissao = salarioMensal * comissao * diaDeSemana;
            System.out.printf("Mês: %s, Salário: %.2f\n", dataAnterior.getMonth(), salarioComComissao);
            diaDeSemana = 0;
            dataAnterior = data;
            

    }
    
    }
}