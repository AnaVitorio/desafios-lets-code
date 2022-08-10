import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {

        List<String> datas = buscarPadrao("\\d{4}-\\d{2}-\\d{2}", "src\\pessoas.txt");
        List<String> ufs = buscarPadrao("[A-Z]{2}$", "src\\pessoas.txt");
        ufs.remove(0);
        List<String> nomes = buscarPadrao("^(\\w+)(?=\\d{4}-\\d{2}-\\d{2})*\\s?\\w+", "src\\pessoas.txt");
        nomes.remove(0);
        List<Pessoa> listaPessoas = new ArrayList<>();

        nomes.stream().forEach(nome -> {
            Pessoa pessoa = new Pessoa();
            pessoa.setDataNascimento(datas.get(nomes.indexOf(nome)));
            pessoa.setUf(ufs.get(nomes.indexOf(nome)));
            pessoa.setNome(nome);
            listaPessoas.add(pessoa);
        });


        listaPessoas.stream().forEach(pessoa -> System.out.println(pessoa));
    }

    public static List<String> buscarPadrao(String regex, String pathArquivo) {
        List<String> listaInformacoes = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(pathArquivo))) {
            stream.forEach(linha -> {
                Pattern patternData = Pattern.compile(regex);
                Matcher matcher = patternData.matcher(linha);
                Stream<MatchResult> streamMacht = matcher.results();
                streamMacht.forEach(string -> listaInformacoes.add(string.group()));    

            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaInformacoes;
    }

}
