import java.util.List;

public abstract class Cliente extends Investimento {

    public List<Investimento> getCarteiraInvestimentos() {
        return carteiraInvestimentos;
    }
}
