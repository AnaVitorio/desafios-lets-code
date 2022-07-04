import java.text.Normalizer;
import java.text.Normalizer.Form;

public class RemoveAcentos implements FormatacaoInterface {

    @Override
    public String formatar(String mensagem) {
        return Normalizer.normalize(mensagem, Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }
    
}
