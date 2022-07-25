import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class LendoArquivoRegras {
    public static void main(String[] args) {
        leitor("src/regras.txt");
    }


    public static void leitor(String path){
        try (Stream<String> stream = Files.lines(Paths.get(path))) {
	        stream.forEach((String line) -> {
	        	System.out.println(line);
	        });
		} catch (IOException e) {
			e.printStackTrace();
		}

    }
}
