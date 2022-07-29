public class App {
    public static void main(String[] args) throws Exception {
        Leitor leitor = new Leitor();
        Fazenda fazenda = new Fazenda(leitor);
        fazenda.adicionarPlantacoes(leitor.getQuantidadePlantacoes());
        Plantacao plantacao = new Plantacao(leitor);
        plantacao.iniciar(fazenda);

    }
}


