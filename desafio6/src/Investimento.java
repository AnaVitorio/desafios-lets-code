import java.util.List;

public class Investimento{
    protected static List<Investimento> carteiraInvestimentos;
    
     private static void contratarInvestimento(Investimento investimento) {
        carteiraInvestimentos.add(investimento);
    }

   
    
}
