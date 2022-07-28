public class App {
    public static void main(String[] args) throws Exception {
        Fazenda fazenda = new Fazenda();
        fazenda.adicionarPlantacoes(3);
        Plantacao plantacao = new Plantacao();
        plantacao.iniciar(fazenda);

        // Relatorio relatorio = new Relatorio();
        // relatorio.gerar(caminhao);
        
        // Leitor leitor = new Leitor();
        // System.out.println(leitor.getData());
        // System.out.println(leitor.getQuantidadePlantacoes());
        // System.out.println(leitor.getVariedadeEDist());
        // System.out.println(leitor.getVariedadeEQtd());
        // System.out.println(leitor.getQtdRecepcao());
        // System.out.println(leitor.getCapacidadeTransCaminhao());
        // System.out.println(leitor.getLimiteSupEsperaNoLagar());
    }
}


// não vou me importar com a ordem que eles está seguindo
// o importe e que o relatório só seja gerado depois de todas as threads terem rodados
// porque ai ele já vai ter todas as informações necessárias para calcular o tempo