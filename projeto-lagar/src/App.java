public class App {
    public static void main(String[] args) throws Exception {
        Fazenda fazenda = new Fazenda();
        fazenda.adicionarPlantacoes(3);
        Plantacao plantacao = new Plantacao();
        plantacao.iniciar(fazenda);

        // Relatorio relatorio = new Relatorio();
        // relatorio.gerar(caminhao);

        
        System.out.println("FIM");
        String pathArquivo = "src\\regras.txt";
        LeitorStrategy leitor = new Leitor();
       System.out.println( leitor.getData(pathArquivo));

        // fazer um wait no Relatório e a Thread main notifyALl()
    }


}


// não vou me importar com a ordem que eles está seguindo
// o importe e que o relatório só seja gerado depois de todas as threads terem rodados
// porque ai ele já vai ter todas as informações necessárias para calcular o tempo