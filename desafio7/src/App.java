public class App {
    public static void main(String[] args) throws Exception {
        String mensagem = "Olá mundo";

        FormataMaiusculo maiusculo = new FormataMaiusculo();
        System.out.println("Formata Maiúsculo: "+maiusculo.formatar(mensagem));

        FormataMinusculo minuscula = new FormataMinusculo();
        System.out.println("Formata Minúsculo: "+minuscula.formatar(mensagem));

        RemoveAcentos removeAcentos = new RemoveAcentos();
        System.out.println("Remove Acentos: "+removeAcentos.formatar(mensagem));

        SemFormatacao semFormatacao = new SemFormatacao();
        System.out.println("Sem Formatação: "+semFormatacao.formatar(mensagem));

        
       FormataCamelCase camelCase = new FormataCamelCase();
       System.out.println("Camel Case: "+camelCase.formatar(mensagem));
      

       
    }
}
