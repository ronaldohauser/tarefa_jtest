import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> lista = List.of("Amanda -f", "Ronaldo -m", "Junior -m", "João -m", "Eliana -f");
        List<String> mulheres = filtrarMulheres(lista);
        imprimirListaMulheres(mulheres);
    }

    public static List<String> filtrarMulheres(List<String> lista) {
        return lista.stream()
                .filter(nome -> nome.endsWith("-f"))
                .map(nome -> nome.substring(0, nome.indexOf(" ")))
                .collect(Collectors.toList());
    }

    public static void imprimirListaMulheres(List<String> mulheres) {
        System.out.println("Lista de Mulheres: " + mulheres);
    }
}
