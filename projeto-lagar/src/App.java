public class App {
    public static void main(String[] args) throws Exception {
        Leitor leitor = new Leitor();
        Fazenda fazenda = new Fazenda(leitor);
        fazenda.adicionarPlantacoes(leitor.getQuantidadePlantacoes());
        Plantacao plantacao = new Plantacao(leitor);
        plantacao.iniciar(fazenda);
      
       

        // System.out.println(leitor.getData());
        // System.out.println(leitor.getQuantidadeVariedade());
        // System.out.println(leitor.getQuantidadePlantacoes());
        // System.out.println(leitor.getVariedadeEQtd());
        // System.out.println(leitor.getVariedadeEDist());
        // System.out.println(leitor.getQtdRecepcao());
        // System.out.println(leitor.getCapacidadeDeCarga());
        // System.out.println(leitor.getCapacidadeDeDescarga());
        // System.out.println(leitor.getFatorMultiplicador());
        // System.out.println(leitor.getLimiteSupEsperaNoLagar());
        // System.out.println(leitor.getLimiteInfParaVoltarAOperar());
        // System.out.println(leitor.getCapacidadeTransCaminhao());
        // System.out.println(leitor.getLimiteDeInterrupcaoDaCarga());


        



    }
}


