public class FormataCamelCase implements FormatacaoInterface {

    @Override
    public String formatar(String mensagem) {
        String[] mensagemSeparada =  mensagem.split(" ");
        String novaMensagem = "";

        for(String palavra : mensagemSeparada){
            char primeiraLetra = palavra.charAt(0);
            palavra = palavra.replace(primeiraLetra, Character.toUpperCase(primeiraLetra));
            novaMensagem = novaMensagem+palavra;

        }
        return novaMensagem;
        
    }
    
}
