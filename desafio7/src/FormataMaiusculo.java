public class FormataMaiusculo implements FormatacaoInterface {

    @Override
    public String formatar(String mensagem) {

        return mensagem.toUpperCase();
        
    }
    
}
