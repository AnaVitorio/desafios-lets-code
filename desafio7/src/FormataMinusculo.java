public class FormataMinusculo implements FormatacaoInterface {

    @Override
    public String formatar(String mensagem) {
        return mensagem.toLowerCase();
        
    }
    
}
