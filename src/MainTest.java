import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testListaMulheres() {
        List<String> lista = List.of("Amanda -f", "Ronaldo -m", "Junior -m", "João -m", "Eliana -f");
        List<String> mulheres = Main.filtrarMulheres(lista);
        assertEquals(List.of("Amanda", "Eliana"), mulheres);
    }
}
